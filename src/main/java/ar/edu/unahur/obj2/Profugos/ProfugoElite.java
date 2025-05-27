package ar.edu.unahur.obj2.Profugos;

public class ProfugoElite extends ProfugoDecorador{

    public ProfugoElite(IProfugo decorado) {
        super(decorado);
    }

    public Boolean esNervioso() {
        return Boolean.FALSE;
    }

}
