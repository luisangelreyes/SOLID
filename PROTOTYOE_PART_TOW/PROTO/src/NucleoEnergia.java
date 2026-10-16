public class NucleoEnergia implements Prototipo{
    private String nombre;
    private  int capacidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public NucleoEnergia(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    @Override 
    public NucleoEnergia clonar(){
        return  new NucleoEnergia(nombre, capacidad);
    }

    public static NucleoEnergia crearInicial(){
        return new NucleoEnergia("Zero point", 300);
    }

    
    
}
