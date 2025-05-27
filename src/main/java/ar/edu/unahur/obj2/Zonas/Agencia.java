package ar.edu.unahur.obj2.Zonas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.Cazadores.CazadorBase;
import ar.edu.unahur.obj2.Profugos.IProfugo;

public class Agencia {
    private List<CazadorBase> cazadores;

    public Agencia(List<CazadorBase> cazadores){
        this.cazadores = cazadores;
    }

    public Agencia(){
        this.cazadores = new ArrayList<>();
    }

    public List<IProfugo> todosLosProfugosCapturados(){
        return this.cazadores.stream().flatMap(cazador -> cazador.getProfugosCapturados().stream())
        .collect(Collectors.toList());
    }

    public Optional<IProfugo> profugoMasHabil(){
        return this.todosLosProfugosCapturados().stream().max(Comparator.comparingInt(IProfugo::getHabilidad));
    }

    public CazadorBase cazadorConMasCapturas(){ //seria buena practica que filtre los cazadores con listas vacias.
                                                // intente resolverlo de esta forma pero no logre saber como hacerlo:
                                                //return cazadores.stream().map(cazador -> cazador.getProfugosCapturados().stream().count())
                                                //.max();
        return cazadores.stream().filter(c -> !c.getProfugosCapturados().isEmpty())
        .max(Comparator.comparingInt(c -> c.getProfugosCapturados().size()))
        .orElseThrow(() -> new IllegalStateException("No hay cazadores con profugos capturados"));
    }
}
