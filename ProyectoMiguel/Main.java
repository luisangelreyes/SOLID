public class Main {
    public static void main(String[] arg){
        Piston miPiston = new Piston();
        Lampara miLampara = new Lampara();
        Puerta miPuerta = new Puerta();
        BLoqueMusical miBLoqueMusical = new BloqueMusical();
        
        System.out.println("Se activa la palanca");

        miPiston.activar();
        miLampara.activar();
        miPuerta.activar();
        miBLoqueMusical.activar();

        System.out.println("Se desactiva la palanca");

        miPiston.desactivar();
        miLampara.desactivar();
        miPuerta.desactivar();
        miBLoqueMusical.desactivar();

    Zombie unZombie = new Zombie();
    Esqueleto unEsqueleto = new Esqueleto();

    miZombie.quemarLava();
    miEsqueleto.quemarLava();
    

    System.out.println("Zombie te golpeó");
    unZombie.atacar();
    System.out.println("Esqueleto te dispara una flecha");
    unEsqueleto.atacar();
    }

    
}