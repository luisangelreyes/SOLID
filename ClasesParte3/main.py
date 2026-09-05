from abc import ABC, abstractmethod

class Personaje(ABC):
    def __init__(self, nombre,vida):
        self.nombre = nombre
        self.vida = vida
    
    def recibir_danio(self,cantidad):
        self.vida -= cantidad
        print(f"recibie {cantidad} de daño")
        print(f"Vida restante: {self.vida}")
    
    @abstractmethod
    def atacar(self):
        pass
    
class ICurable(ABC):
    @abstractmethod
    def curar(self,objetivo):
        pass

class Gerrero(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con su espada")

class Mago(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con el Sr.Clic")
    def curar(self,objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} cura a {objetivo.nombre}")

class Soporte(Personaje):
    def atacar(self):
        print(f"{self.nombre} ataca con baston")
    def curar(self,objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} cura a {objetivo.nombre}")

gerrero = Gerrero("Po",100)
mago = Mago("Tai Long",100)
soporte = Soporte("Maestro Shifu",100)

gerrero.atacar()
mago.atacar()
soporte.atacar()

gerrero.recibir_danio(10)
mago.recibir_danio(10)
soporte.recibir_danio(10)


mago.curar(gerrero)
soporte.curar(mago)

print (f"La vida de {gerrero.nombre} es: {gerrero.vida}")
print (f"La vida de {mago.nombre} es: {mago.vida}")
print (f"La vida de {soporte.nombre} es: {soporte.vida}")


