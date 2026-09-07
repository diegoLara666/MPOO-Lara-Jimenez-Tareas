package SmartHome;

public class Persiana {
    private boolean estaAbierta;
    private int porcentajeApertura;
    private boolean modoAutomatico;

    public Persiana(int porcentajeApertura, boolean modoAutomatico) {
        this.porcentajeApertura = porcentajeApertura;
        this.estaAbierta = (porcentajeApertura > 0);
        this.modoAutomatico = modoAutomatico;
    }

    public void ajustarApertura(int porcentaje) {
        if(porcentaje >= 0 && porcentaje <= 100) {
            this.porcentajeApertura = porcentaje;
            this.estaAbierta = (porcentaje > 0);
        }
    }

    public void activarModoAutomatico(boolean estado) {
        this.modoAutomatico = estado;
    }

  
    public double tiempoEstimadoMovimiento(int nuevoPorcentaje) {
        int diferencia = Math.abs(this.porcentajeApertura - nuevoPorcentaje);
        return diferencia * 0.5; 
    }

    public void verEstadoActual() {
        System.out.println("Persiana | Estado=[" + (estaAbierta ? "ABIERTA" : "CERRADA") + 
                           "] | Apertura=[" + porcentajeApertura + "%] | Auto=[" + modoAutomatico + "]");
    }
}