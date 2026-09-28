package LSP_Part_II;

public class CuentaAhorro extends CuentaBancaria {
    private double tasaIntereses;
    public CuentaAhorro(String numeroCuenta, double saldoInicial){
        super(numeroCuenta, saldoInicial);
        this.tasaIntereses = 0.05;
    }
    public double calcularIntereses(){
        return saldo * tasaIntereses;
    }
    public void pagarDeuda(){
        throw new IllegalArgumentException("No hay deuda que pagar");
    }

}
