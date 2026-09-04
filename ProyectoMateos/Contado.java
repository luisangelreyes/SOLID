package ProyectoMateos;

public class Contado implements MetodoPago{
    private boolean estadoBillete;

    public Contado(boolean estadoBillete){
        this.estadoBillete = estadoBillete;
    }

    @Override
    public boolean validar(){
        if(estadoBillete == true){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void pagar(double monto){
        System.out.println("Billete buen estado" + monto);
    } 
}
