public class Cerveza extends Bebida{
    
    private double IEPS = 1.25;
    
    
    public Cerveza (String nombreBebida, double precioBase){
        super(nombreBebida,Etiqueta.CON_IVA, precioBase );
    }

    @Override 
    public boolean requiereINE(){
        return true;
    }
    
    @Override 
    public double  calcularTotal(){
        return getPrecioBase() * (1 + IVA) * IEPS;
    }
}