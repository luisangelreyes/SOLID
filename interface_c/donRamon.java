package interface_c;

public class donRamon implements AccionesPersonaje {
    private final String nombre = "Don Ramon";

    
    public void darGolpe(){
        System.out.println("A sí?"+ nombre + "Pues Tomaaa (sonido de campana)");
    }

    
    public void pagarRenta(){
        throw new UnsupportedOperationException(nombre +"No está en su casa");
    }

        

    public void cobrarRenta(){
         throw new UnsupportedOperationException(nombre + "No tiene la barriga señor propiedad... digo, digo ");
    }

    
    public void jugar(){
         throw new UnsupportedOperationException(nombre + "Bueno, tu me ves cara de juego?");
    }
    
    
    public void llorar(){
        throw new UnsupportedOperationException(nombre + "iiiiiiiiii");
    }
}
