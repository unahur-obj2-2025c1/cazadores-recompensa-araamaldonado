package ar.edu.unahur.obj2.Zonas;

import java.util.List;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public abstract class ZonaBase {
    private List<IProfugo> profugos;

    public List<IProfugo> getProfugos() {
        return profugos;
    }

    public void quitarProfugo(IProfugo profugo){
        this.profugos.remove(profugo);
    }
}
