package cuidandonos;

import cuidandonos.demora.CalculadorDeDemora;
import cuidandonos.distancia.CalculadorDeDistancia;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Viaje {
    private Ubicacion puntoDePartida;
    private Ubicacion destino;
    private double demoraAproximadaEnMins;

    public void calcularDemoraAproximadaEnMins(CalculadorDeDistancia calculadorDeDistancia, CalculadorDeDemora calculadorDeDemora) {
        float distanciaEnMetros = calculadorDeDistancia.distanciaEnMetrosEntre(this.puntoDePartida, this.destino);
        this.demoraAproximadaEnMins = calculadorDeDemora.demoraAproximadaEnMinsParaRecorrer(distanciaEnMetros);
    }
}
