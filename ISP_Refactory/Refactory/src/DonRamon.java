public class DonRamon implements Inquilino, Habitante, Educador{
    private String nombre = "Don Ramón";

    @Override 
    public void pagarRenta() {
        System.out.println(nombre + " no está en su departamento o eso jura la chilindrina");
    }

    @Override 
    public void interactuarConElChavo() {
        System.out.println(nombre + " y no te doy otra nomas por mi abuelita era trapecista");
    }

    @Override 
    public void impartirClase(){
        System.out.println("Si ven una calavera como esta... significa  PELIGROO. si se tomna una botella, y tiene esa calavera (sonido de tomar, gloo gloo gloo)... se mueren");
    }

    @Override 
    public void hacerCorajes(){
        System.out.println("RE-PROBADO");
    }

    
    @Override 
    public void pasarLista(){
        System.out.println("Chilindrina...");
    }

}
