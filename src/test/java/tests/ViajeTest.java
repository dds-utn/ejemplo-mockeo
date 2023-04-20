package tests;

import cuidandonos.Ubicacion;
import cuidandonos.Viaje;
import cuidandonos.demora.CalculadorDeDemora;
import cuidandonos.distancia.CalculadorDeDistancia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ViajeTest {

    @Test
    public void demoraDe10MinsEnViaje() {
        Ubicacion medrano = new Ubicacion(-34.598450F, -58.420065F, "UTN BA Medrano");
        Ubicacion campus = new Ubicacion(-34.659277F, -58.4673392F, "UTN BA Campus");

        Viaje viajeDeSedeASede = new Viaje();
        viajeDeSedeASede.setPuntoDePartida(medrano);
        viajeDeSedeASede.setDestino(campus);

        CalculadorDeDistancia calculadorDeDistancia = mock(CalculadorDeDistancia.class);
        when(calculadorDeDistancia.distanciaEnMetrosEntre(medrano, campus)).thenReturn(10100F);

        CalculadorDeDemora calculadorDeDemora = mock(CalculadorDeDemora.class);
        when(calculadorDeDemora.demoraAproximadaEnMinsParaRecorrer(10100F)).thenReturn(30.0);

        viajeDeSedeASede.calcularDemoraAproximadaEnMins(calculadorDeDistancia, calculadorDeDemora);

        Assertions.assertEquals(30.0, viajeDeSedeASede.getDemoraAproximadaEnMins());
    }
}
