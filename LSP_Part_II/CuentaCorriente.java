package LSP_Part_II;

public class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro;
    private double tasaInteres;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, double limiteSobregiro){
        super(numeroCuenta, saldoInicial);
        if (limiteSobregiro < 0) {
            throw new IllegalArgumentException("El limite Sobregiro no debe ser menor a 0");
        }
        this.limiteSobregiro = limiteSobregiro;
        this.tasaIntereses = 0.02;
    }
    @Override 
    public void retirar(double cantidad){
        validarCantidad(cantidad);
        if(cantidad > saldo + limiteSobregiro){
            throw new IllegalArgumentException("La operacion excede el limite");
        }
        saldo -= cantidad;
    }
    @Override 
    public double calcularIntereses(){
        if(saldo < 0){
            limiteSobregiro = Math.abs(saldo);
        return limiteSobregiro * tasaInteres;
        }
        return 0;
    }
    @Override 
    public double ConsultarSobregiroUtilizado(){
        if (saldo < 0) {
            return Math.abs(saldo);
        }
        return 0;
    }
    public double getLimiteSobregiro(){
        return limiteSobregiro;
    }

}

