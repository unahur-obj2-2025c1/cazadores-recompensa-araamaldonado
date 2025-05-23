package ar.edu.unahur.obj2.Cazadores;

import java.util.List;
import ar.edu.unahur.obj2.Profugos.IProfugo;

public abstract class CazadorBase {
    private Integer experiencia;
    private List<IProfugo> profugosCapturados;

    public Boolean esMasExperimentado(IProfugo profugo){
        return this.getExperiencia() > profugo.getInocencia();
    }

    public void intimidar(IProfugo profugo){
        profugo.disminuirInocencia();
        this.debuffSegunTipo(profugo);
    }

    public abstract void debuffSegunTipo(IProfugo profugo);

    public abstract Boolean capturaEspecifica(IProfugo profugo);

    public void capturar(IProfugo profugo){
        if (this.esMasExperimentado(profugo) && this.capturaEspecifica(profugo)){

        }else{

        }
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void sumarExperiencia(IProfugo profugo) {
        this.experiencia += ;
    }
}
