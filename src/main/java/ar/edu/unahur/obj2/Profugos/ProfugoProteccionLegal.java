package ar.edu.unahur.obj2.Profugos;

public class ProfugoProteccionLegal extends ProfugoDecorador{

    public ProfugoProteccionLegal(IProfugo decorado) {
        super(decorado);
    }

    public Integer getInocencia(){
        return Math.max(40, profugo.getInocencia());
    }

}
