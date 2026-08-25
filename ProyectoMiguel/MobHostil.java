public abstract class MobHostil {
    private String nombre;
    private int Salud;
    
public MobHostil(String nombre, int Salud){
    this.nombre = nombre;
    this.salud = salud;
}

public void quemarLava(){
    this.salud -= 5;
    System.out.println(nombre + "se está quemando en la lava. Salud restante: " + Salud)
}

abstract public void atacar();
}
    