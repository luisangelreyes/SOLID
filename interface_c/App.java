public class App {
    public static void main(String[] args) {
        donRamon DonRamon = new donRamon();
        doñaFlorinda Florinda = new doñaFlorinda();
        Ñoño ñoño = new Ñoño();


        System.out.println("Este es el programa numero uno de la television humoristica... El Chavo, Interpretrado por el super comediante, Chespirito, Con Ramon Valdez como Don Ramon, Edgar Vivar como Ñoño y como el Sr Barriga y Florinda Meza como doña Florinda");

        try{
            DonRamon.darGolpe();
        }catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
        }
        try{
            DonRamon.pagarRenta();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        try{
            DonRamon.cobrarRenta();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        try{
            DonRamon.jugar();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
            try{
            DonRamon.llorar();
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        }
        
        

    }
}
