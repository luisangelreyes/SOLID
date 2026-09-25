public class Agua extends Bebida{
    public Agua(String nombreBebida, double precioBase){
        
        super(nombreBebida,Etiqueta.CON_IVA, precioBase );
    
    }
    @Override 
    public boolean requiereINE(){
        return false;
    }
    
    @Override 
    public double calcularTotal(){
        return getPrecioBase();
    }
    
}