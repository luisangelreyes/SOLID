public abstract class Enemigo {
    protected String nombre;
    protected int vida;
    protected int ataque;

    public Enemigo(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public abstract void atacar();

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) {
            vida = 0;
        }
    }
    
    public boolean estaVivo(){
        return this.vida > 0;
    }

    public String getNombre(){
        return this.nombre; 
    }

    public int getVida(){
        return this.vida;
    }

    public int getAtaque(){
        return this.ataque;
    }
}