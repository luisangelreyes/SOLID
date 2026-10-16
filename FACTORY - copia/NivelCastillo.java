public class NivelCastillo extends Nivel {
    public NivelCastillo(){
        super("Castillo embrujado");
    }

    @Override 
    public Enemigo crearEnemigo(){
        return new Esqueleto();
    }
}

