public class doñaFlorinda implements AccionesPersonaje{
    private final String nombre = "Doña Florinda";

    @Override 
    public void darGolpe(){
        System.out.println("Pues vaya a tirarle los calzones a su abuela"+ nombre + "(sonido de cachetada)");
    }

    @Override
    public void pagarRenta(){
         System.out.println(nombre +"Paga la renta");
    }

    @Override 
    public void cobrarRenta(){
        throw new UnsupportedOperationException(nombre + "No tiene la barriga señor propiedad... digo, digo ");
    }

    @Override 
    public void jugar(){
        throw new UnsupportedOperationException(nombre + "Bueno, tu me ves cara de juego?");
    }
    
    @Override 
    public void llorar(){
        throw new UnsupportedOperationException(nombre + "aaaaaaaah");
    }
    
}
