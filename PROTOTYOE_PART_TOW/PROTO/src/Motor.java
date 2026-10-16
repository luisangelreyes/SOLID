public class Motor implements Prototipo{
    private String nombre;
    private int potencia;
    private NucleoEnergia nucleo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public NucleoEnergia getNucleo() {
        return nucleo;
    }

    public void setNucleo(NucleoEnergia nucleo) {
        this.nucleo = nucleo;
    }

    @Override 
    public Motor clonar(){
        return new Motor(nombre, potencia, nucleo);
    }

    public Motor(String nombre, int potencia, NucleoEnergia nucleo){
        this.nombre = nombre;
        this.potencia = potencia;
        this.nucleo = nucleo;
    }
}
