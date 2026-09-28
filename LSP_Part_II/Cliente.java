package LSP_Part_II;

public class Cliente {
    private String nombre;
    private String id;
    private CuentaBancaria cuenta;

    public Cliente (String nombre, String id, CuentaBancaria cuenta){
        this.nombre = nombre;
        this.id = id;
        this.cuenta = cuenta;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getId(){
        return id;
    }

    public CuentaBancaria cuenta(){
        return cuenta;
    }
    public void depositar(double cantidad){
        cuenta.depositar(cantidad);
    }
    public void retirar(double cantidad){
        cuenta.retirar(cantidad);
    }
    public double consultarSaldo(){
        return saldo;
    }
    public double calcularInteres(){
        return cuenta.calcularInteres();
    }
    public void pagarDeuda(double  cantidad){
        return cuenta.pagarDeuda();
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Cuenta: " + cuenta + "\n"+ "Saldo: $" +String.format("%.2f", consultarSaldo()));
    }
}
