public class Nivel {
    private int tipoNivel;

    public Nivel(int tipoNivel){
        this.tipoNivel = tipoNivel;
    }

    public void jugar (){
        String nombre = " ";
        Enemigo enemigo = null;

        if(tipoNivel == 1){
            nombre = "Bosque Oscuro";
            enemigo = new Lobo();
        }else if(tipoNivel == 2){
            nombre = "Castillo Embrujado";
            enemigo = new Esqueleto();
        }else if(tipoNivel == 3){
            nombre = "Volcan Infernal";
            enemigo = new Dragon();
        }else{
            return;
        }

        System.out.println("\n ==="+ nombre + "===");
        int vidaJugador = 50;

        while(enemigo.estaVivo() && vidaJugador>0){
            enemigo.recibirDanio(20);

            if(enemigo.estaVivo()){
                enemigo.atacar();
                vidaJugador -= enemigo.getAtaque();
            }
        }

        if(vidaJugador > 0){
            System.out.println("Ganaste");
        }else{
            System.out.println("Perdiste");
        }
    }
}
