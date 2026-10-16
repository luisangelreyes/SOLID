public class NivelVolcan extends Nivel {
    public NivelVolcan(){
        super("Volcan infernal");
    }
    @Override 
    public Enemigo crearEnemigo(){
        return new Dragon();
    }
    
}
