package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class CazadorSigiloso extends CazadorBase{

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public void debuffSegunTipo(IProfugo profugo) {
        profugo.reducirHabilidad(); //como mierda reduzco las 5 unidades
    }

    @Override
    public Boolean capturaEspecifica(IProfugo profugo) {
        return profugo.getHabilidad() < 50;
    }

}
