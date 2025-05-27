package ar.edu.unahur.obj2.Profugos;

public class ProfugoArteMarcialAvanzada extends ProfugoDecorador{

    public ProfugoArteMarcialAvanzada(IProfugo decorado) {
        super(decorado);
    }

    public Integer getHabilidad(){
        return Math.min(100, profugo.getHabilidad() * 2);
    }
}
