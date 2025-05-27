package ar.edu.unahur.obj2.Profugos;

public abstract class ProfugoDecorador implements IProfugo {
    protected IProfugo profugo; // A QUE PROFUGO VOY A DECORAR, A QUE CLASE VOY A ESTAR DECORANDO.
                            // ESTO SIEMPRE QUE APLICO EL PATRON DECORATOR TIENE QUE ESTAR PARA QUE 
                            // EL CODIGO QUE LE AGREGUEMOS CON EL EDCORATOR SURTA EFECTO EN 
                            // LA CLASE DESEADA A MODIFICAR.
    public ProfugoDecorador(IProfugo decorado){
        this.profugo = decorado;
    }

    public IProfugo getProfugo() {
        return profugo;
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugo.dejarDeEstarNervioso();
    }

    @Override
    public void disminuirInocencia() {
        profugo.disminuirInocencia();
    }

    @Override
    public Boolean esNervioso() {
        return profugo.esNervioso();
    }

    @Override
    public Integer getHabilidad() {
        return profugo.getHabilidad();
    }

    @Override
    public Integer getInocencia() {
        return profugo.getInocencia();
    }

    @Override
    public void reducirHabilidad() {
        profugo.reducirHabilidad();
    }

    @Override
    public void volverseNervioso() {
        profugo.volverseNervioso();
    }
}
