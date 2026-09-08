class Jugador
    attr_accessor :nombre, :puntos, :vidas

    def initialize(nombre)
        @nombre = nombre
        @puntos = 0
        @vidas = 3
    end
end

class MonedaMutante
    def recolectar(jugador)
        jugador.puntos += 100
        puts "Marcador: #{jugador.puntos}"
        puts "'ding.mp3'"
    end
end

class GoombaMutante
    def atacar(jugador)
        jugador.vidas -= 1
        puts "te quedan: #{jugador.vidas}"
        puts "''ahhhhhhhh.mp3"
        if jugador.vidas <= 0
            puts "'oh_mamamiaaaaa.mp3'"
            puts "'ay ay ay ayyyyy Game Over'"
        end
    end
end

mario = Jugador.new("Mario")
moneda = MonedaMutante.new
goomba = GoombaMutante.new

puts " 1-1 "
puts " Mario : x#{mario.vidas}"
moneda.recolectar(mario)


print "¿Cuantos goombas emboscan a mario de golpe?: "
cantidad_goombas = gets.chomp.to_i


cantidad_goombas.times do 
    goomba.atacar(mario)
end


