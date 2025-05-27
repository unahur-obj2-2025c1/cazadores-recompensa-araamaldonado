package ar.edu.unahur.obj2.Profugos;

public class ProfugoBase implements IProfugo{
    private Integer inocencia;
    private Integer nvlHabilidad;
    private Boolean estaNervioso;

    public ProfugoBase(Integer inocencia, Integer nvlHabilidad, Boolean estaNervioso){
        if (inocencia >= 0 && nvlHabilidad >= 1 || nvlHabilidad <= 100){
            this.inocencia = inocencia;
            this.nvlHabilidad = nvlHabilidad;
            this.estaNervioso = estaNervioso;
        }else{
            System.out.println("El nivel de inocencia debe ser positivo y/o la habilidad debe ser entre 1 y 100");
        }

    }

    public Integer getInocencia() {
        return inocencia;
    }

    public Integer getNvlHabilidad() {
        return nvlHabilidad;
    }

    public Boolean getEstaNervioso() {
        return estaNervioso;
    }

    public void reducirHabilidad(){
        this.nvlHabilidad = Integer.max(1, nvlHabilidad - 5);
    }

    @Override
    public Integer getHabilidad() {
        return this.nvlHabilidad;
    }

    @Override
    public Boolean esNervioso() {
        return this.estaNervioso;
    }

    @Override
    public void volverseNervioso() {
        this.estaNervioso = Boolean.TRUE;
    }

    @Override
    public void dejarDeEstarNervioso() {
        this.estaNervioso = Boolean.FALSE;
    }

    @Override
    public void disminuirInocencia() {
        this.inocencia = Integer.max(0, inocencia - 2);
    }


}
