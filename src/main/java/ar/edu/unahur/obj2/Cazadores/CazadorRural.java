package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class CazadorRural extends CazadorBase{


    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public void debuffSegunTipo(IProfugo profugo) {
        profugo.volverseNervioso();
    }

    @Override
    public Boolean capturaEspecifica(IProfugo profugo) {
        return profugo.esNervioso();
    }

}
