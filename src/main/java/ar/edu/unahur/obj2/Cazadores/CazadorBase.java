package ar.edu.unahur.obj2.Cazadores;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import ar.edu.unahur.obj2.Profugos.IProfugo;
import ar.edu.unahur.obj2.Zonas.ZonaBase;

public abstract class CazadorBase {
    private Integer experiencia;
    private List<IProfugo> profugosCapturados;

    public CazadorBase(Integer experiencia){
        this.experiencia = experiencia;
        this.profugosCapturados = new ArrayList<>();
    }

    public List<IProfugo> getProfugosCapturados() {
        return profugosCapturados;
    }

    public Boolean esMasExperimentado(IProfugo profugo){
        return this.getExperiencia() > profugo.getInocencia();
    }

    public void intimidar(IProfugo profugo){
        profugo.disminuirInocencia();
        this.debuffSegunTipo(profugo);
    }

    public abstract void debuffSegunTipo(IProfugo profugo);

    public abstract Boolean capturaEspecifica(IProfugo profugo);

    public void capturar(ZonaBase zona){

        List<IProfugo> intimidados = new ArrayList<>();
        zona.getProfugos().stream().forEach( profugo -> {
            if (this.esMasExperimentado(profugo) && this.capturaEspecifica(profugo)){
                this.profugosCapturados.add(profugo);
                zona.quitarProfugo(profugo);
            }else{
                this.intimidar(profugo);
                intimidados.add(profugo);
            }});
        this.sumarExperiencia(intimidados);
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public Optional<Integer> minimaHabilidadIntimidados(List<IProfugo> intimidados){
        return intimidados.stream().map(intimidado -> intimidado.getHabilidad()).min(Comparator.naturalOrder());
    }

    public void sumarExperiencia(List<IProfugo> intimidados) {
        Optional<Integer> minHab = minimaHabilidadIntimidados(intimidados);
        this.experiencia +=  (minHab.isPresent() ? minHab.get() : 0) + 2 * profugosCapturados.size();
    }
}
