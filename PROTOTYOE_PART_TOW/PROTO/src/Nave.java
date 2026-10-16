import java.util.ArrayList;
import java.util.List;

public class Nave implements Prototipo{
    private String nombre;
    private int escudo;
    private Motor motor;
    private List<Arma> armas;
    private Tripulacion tripulacion;

    public void mostrar(int indice){
        System.out.println("["+ indice + "]" + nombre +
        "| escudo:"+ escudo+ 
        "|motor: "+ motor.getNombre()+
        "|potencia: " + motor.getPotencia()+ ")"+ 
        "|nucleo:" + motor.getNucleo().getNombre()+ 
        "|capacidad: "+ motor.getNucleo().getCapacidad()+")" +
        "|armas: "+ armas +
        "|piloto"+ tripulacion);
        
    System.out.println("Identidades: nave:" + System.identityHashCode(this)
    +"motor: "+ System.identityHashCode(motor)
    +"núcleo: "+ System.identityHashCode(motor.getNucleo())
    +"lista Armas: "+ System.identityHashCode(armas)
);
    }
    

    public Nave(String nombre, int escudo, Motor motor, List<Arma> armas, Tripulacion tripulacion) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.motor = motor;
        this.armas = armas;
        this.tripulacion = tripulacion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEscudo() {
        return escudo;
    }
    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public List<Arma> getArmas() {
        return armas;
    }
    public void setArmas(List<Arma> armas) {
        this.armas = armas;
    }
    public Tripulacion getTripulacion() {
        return tripulacion;
    }
    public void setTripulacion(Tripulacion tripulacion) {
        this.tripulacion = tripulacion;
    }
    @Override
    
    public Nave clonar(){
        List<Arma> copias = new ArrayList<>();

        for(Arma arma : armas) copias.add(arma.clonar());
        return new Nave(nombre, escudo, motor.clonar(), copias, tripulacion.clonar()); 
    }


}
