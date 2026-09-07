package SmartHome;

public class Foco {
    private boolean encendido;
    private int intensidad;
    private String color;

    public Foco(String color, int intensidad) {
        this.encendido = false;
        this.color = color;
        this.intensidad = intensidad;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }
    
      public double calcularConsumoWatts() {
        if (!encendido) return 0.0;
        return this.intensidad * 0.15; 
    }

    // Método verEstadoActual[cite: 2]
    public void verEstadoActual() {
        System.out.println("Foco | Estado=[" + (encendido ? "ENCENDIDO" : "APAGADO") + 
                           "] | Color=[" + color + "] | Intensidad=[" + intensidad + "%]");
    }
}