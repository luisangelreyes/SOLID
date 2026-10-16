public abstract class Nivel {
    protected String nombre;

    public Nivel (String nombre){
        this.nombre = nombre;
    }

    public abstract Enemigo crearEnemigo();

    public void jugar(){
        Enemigo enemigo = crearEnemigo();
        int vidaJugador = 250;
        int danoJugador = 60;
        int turno = 1;

        System.out.println("\n==="+nombre+"===");
        System.out.println("Aparece un "+enemigo.getNombre()+" con " + enemigo.getVida()+ "puntos de vida");
        while(enemigo.estaVivo() && vidaJugador > 0){
            System.out.println("\n turno: "+turno);

            enemigo.recibirDanio(danoJugador);
            System.out.println("Haz atacado al "+enemigo.getNombre()+" le quedan " + enemigo.getVida()+ "punto");

            if (enemigo.estaVivo()){
                enemigo.atacar();
                vidaJugador -= enemigo.getAtaque();
                System.out.println("te han atacado!! te quedan "+vidaJugador+" puntos");
            }
            turno++;
        }if (vidaJugador > 0){
            System.out.println("Ganaste!!!");
        }else System.out.println("Perdiste!!! el "+ enemigo.getNombre()+ "te humilló");
    }

}