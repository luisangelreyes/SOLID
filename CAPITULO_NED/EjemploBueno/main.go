package main

import "fmt"

func main() {
	fmt.Printf("===== Entorno Real ===== ")

	pasarelaReal := &AdaptadorMercadoPago{TokenAccess: "123!#$"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "54321&$#"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("changotremendo@gmail.com", 1500)

	fmt.Printf("===== Entorno Prueba ===== ")

	pasarelaMock := &SimuladorPasarela{DebeFallar: true}
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	_ = servicioMock.ProcesarPago("leide123@gmail.com", 3500)

}
