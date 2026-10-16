public class NivelBosque extends Nivel {
    public NivelBosque(){
        super("bosque oscuro");
    }

    @Override 
    public Enemigo crearEnemigo(){
        return new Lobo();
    }
}
