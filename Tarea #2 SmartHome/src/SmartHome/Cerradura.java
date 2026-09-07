package SmartHome;

public class Cerradura {
    private boolean bloqueada;
    private int nivelBateria;
    private String codigoAcceso;

    public Cerradura(String codigoAcceso) {
        this.bloqueada = true;
        this.nivelBateria = 100;
        this.codigoAcceso = codigoAcceso;
    }

    public void bloquear() {
        this.bloqueada = true;
    }

    public void desbloquear(String intento) {
        if (this.codigoAcceso.equals(intento) && this.nivelBateria > 0) {
            this.bloqueada = false;
            drenarBateria(2); 
        } else {
            System.out.println("Cerradura: Código incorrecto o sin batería.");
        }
    }

    
    private void drenarBateria(int cantidad) {
        this.nivelBateria -= cantidad;
        if (this.nivelBateria < 0) this.nivelBateria = 0;
    }

    public void verEstadoActual() {
        System.out.println("Cerradura | Estado=[" + (bloqueada ? "BLOQUEADA" : "DESBLOQUEADA") + 
                           "] | Batería=[" + nivelBateria + "%]");
    }
}