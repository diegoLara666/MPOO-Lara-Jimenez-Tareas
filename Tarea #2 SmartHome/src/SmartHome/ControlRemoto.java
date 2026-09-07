package SmartHome;

public class ControlRemoto {
    

    private Foco foco;
    private Ventilador ventilador;
    private Cerradura cerradura;
    private Persiana persiana;
    private Cafetera cafetera;

   
    public void setFoco(Foco foco) { 
        this.foco = foco; 
    }
    
    public void setVentilador(Ventilador ventilador) { 
        this.ventilador = ventilador; 
    }
    
    public void setCerradura(Cerradura cerradura) { 
        this.cerradura = cerradura; 
    }
    
    public void setPersiana(Persiana persiana) { 
        this.persiana = persiana; 
    }
    
    public void setCafetera(Cafetera cafetera) { 
        this.cafetera = cafetera; 
    }


    // MODOS DE FUNCIONAMIENTO

    // Modo 1: Prepara la casa para la noche[cite: 2]
    public void modoNoche() {
        System.out.println("\n--- ACTIVANDO MODO NOCHE ---");
        foco.apagar();
        ventilador.encender();
        ventilador.cambiarVelocidad(1); // Velocidad bajita para no hacer ruido
        cerradura.bloquear(); // Asegurar la casa
        persiana.ajustarApertura(0); // Cerrar persianas al 100%
        cafetera.apagar();
    }

  
    public void modoBienvenida() {
        System.out.println("\n--- ACTIVANDO MODO BIENVENIDA ---");
        foco.encender();
        foco.cambiarColor("Blanco Cálido");
        ventilador.encender();
        ventilador.cambiarVelocidad(2);
        persiana.ajustarApertura(80); // Dejar entrar luz
        cerradura.bloquear(); // Se bloquea por seguridad tras entrar
    }


    public void modoSalida() {
        System.out.println("\n--- ACTIVANDO MODO SALIDA (Cerrando casa) ---");
        foco.apagar();
        ventilador.apagar();
        cerradura.bloquear();
        persiana.ajustarApertura(0);
        persiana.activarModoAutomatico(false);
        cafetera.apagar();
    }

  
    // UTILIDAD 
 
    
   
    public void verEstadoTodos() {
        System.out.println("\nESTADO CENTRAL DE LA CASA");
        if(foco != null) foco.verEstadoActual();
        if(ventilador != null) ventilador.verEstadoActual();
        if(cerradura != null) cerradura.verEstadoActual();
        if(persiana != null) persiana.verEstadoActual();
        if(cafetera != null) cafetera.verEstadoActual();
    }
}