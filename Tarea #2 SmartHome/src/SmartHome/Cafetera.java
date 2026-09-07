package SmartHome;

public class Cafetera {
    private boolean encendida;
    private int nivelAguaML;
    private int tazasPreparadasHoy;

    public Cafetera(int nivelAguaML) {
        this.encendida = false;
        this.nivelAguaML = nivelAguaML;
        this.tazasPreparadasHoy = 0;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

   
    public void hacerCafe(int cantidadTazas) {
        int aguaNecesaria = cantidadTazas * 250; // Cada taza necesita 250ml
        
        if (this.encendida && this.nivelAguaML >= aguaNecesaria) {
            this.nivelAguaML -= aguaNecesaria;
            this.tazasPreparadasHoy += cantidadTazas;
            System.out.println("Cafetera: Preparando " + cantidadTazas + " tazas...");
        } else {
            System.out.println("Cafetera: Error. Revisa el agua o si está encendida.");
        }
    }

    public void verEstadoActual() {
        System.out.println("Cafetera | Estado=[" + (encendida ? "ENCENDIDA" : "APAGADA") + 
                           "] | Agua=[" + nivelAguaML + "ml] | Tazas Hoy=[" + tazasPreparadasHoy + "]");
    }
}