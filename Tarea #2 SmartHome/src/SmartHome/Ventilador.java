package SmartHome;

public class Ventilador {
    private boolean encendido;
    private int velocidad; // 1 a 3
    private boolean girando;

    public Ventilador(int velocidad, boolean girando) {
        this.encendido = false;
        this.velocidad = velocidad;
        this.girando = girando;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
        this.girando = false;
    }

    public void cambiarVelocidad(int nuevaVelocidad) {
        if(nuevaVelocidad >= 1 && nuevaVelocidad <= 3) {
            this.velocidad = nuevaVelocidad;
        }
    }

    public void alternarGiro() {
        this.girando = !this.girando;
    }

   
    public int calcularFlujoAire() {
        if (!encendido) return 0;
        return this.velocidad * 50;
    }

    public void verEstadoActual() {
        System.out.println("Ventilador | Estado=[" + (encendido ? "ENCENDIDO" : "APAGADO") + 
                           "] | Velocidad=[" + velocidad + "] | Girando=[" + girando + "]");
    }
}