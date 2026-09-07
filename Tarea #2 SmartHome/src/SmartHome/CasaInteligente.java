package SmartHome;

public class CasaInteligente {

   
    private Foco foco;
    private Ventilador ventilador;
    private Cerradura cerradura;
    private Persiana persiana;
    private Cafetera cafetera;
    private ControlRemoto control;


    public CasaInteligente(Foco foco, Ventilador ventilador, Cerradura cerradura, Persiana persiana, Cafetera cafetera, ControlRemoto control) {
        this.foco = foco;
        this.ventilador = ventilador;
        this.cerradura = cerradura;
        this.persiana = persiana;
        this.cafetera = cafetera;
        this.control = control;
    }

    public static void main(String[] args) {
       
        Foco miFoco = new Foco("Blanco Frío", 100);
        Ventilador miVentilador = new Ventilador(0, false);
        Cerradura miCerradura = new Cerradura("1234");
        Persiana miPersiana = new Persiana(50, true);
        Cafetera miCafetera = new Cafetera(1000); 

     
        ControlRemoto miControl = new ControlRemoto();

        miControl.setFoco(miFoco);
        miControl.setVentilador(miVentilador);
        miControl.setCerradura(miCerradura);
        miControl.setPersiana(miPersiana);
        miControl.setCafetera(miCafetera);

      
        CasaInteligente miCasa = new CasaInteligente(miFoco, miVentilador, miCerradura, miPersiana, miCafetera, miControl);

        // 6. Mostrar el estado inicial
      
        System.out.println("        INICIANDO SMART HOME             ");
      
        miControl.verEstadoTodos();

    
        System.out.println("\n>>> 1. PRUEBA MANUAL DESDE MAIN <<<");
        System.out.println("Encendiendo foco y haciendo 2 tazas de café manualmente...");
        miFoco.encender();
        miFoco.cambiarColor("Azul");
        miCafetera.encender();
        miCafetera.hacerCafe(2); // Gasta 500ml de agua
        miControl.verEstadoTodos();

       
        // PRUEBAS CON EL CONTROL 
        System.out.println("\n>>> 2. PRUEBA DE MODOS DEL CONTROL REMOTO <<<");
        
        // Ejecutar Modo Bienvenida
        miControl.modoBienvenida();
        miControl.verEstadoTodos();
 

   
        miControl.modoNoche();
        miControl.verEstadoTodos();
  
        // Ejecutar Tercer Modo 
        miControl.modoSalida();
        miControl.verEstadoTodos();
     

       
        System.out.println("        SIMULACIÓN FINALIZADA            ");
      
        
    }
}