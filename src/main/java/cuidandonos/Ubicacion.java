package cuidandonos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Ubicacion {
    private float latitud;
    private float longitud;
    private String referencia;

    public Ubicacion(float latitud, float longitud, String referencia) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.referencia = referencia;
    }
}
