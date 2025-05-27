package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class CazadorUrbano extends CazadorBase{

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }

    @Override
    public void debuffSegunTipo(IProfugo profugo) {
        profugo.dejarDeEstarNervioso();
    }

    @Override
    public Boolean capturaEspecifica(IProfugo profugo) {
        return !profugo.esNervioso();
    }

}
