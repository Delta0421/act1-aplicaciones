public class Ejercicio6 {
    
    public void metodoA() throws Ejercicio3 {
        throw new Ejercicio3("Error original en el método A");
    }
    
    public void metodoB() throws ExcepcionCadenaPersonalizada {
        try {
            metodoA();
        } catch (Ejercicio3 e) {
            throw new ExcepcionCadenaPersonalizada("Error en el método B causado por: " + e.getMessage(), e);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio6 ejecutor = new Ejercicio6();
        
        try {
            ejecutor.metodoB();
        } catch (ExcepcionCadenaPersonalizada e) {
            System.out.println("Stack Trace de la cadena de excepciones:");
            e.printStackTrace();
            
            System.out.println("\n--- Análisis ---");
            System.out.println("Excepción capturada: " + e.getClass().getName());
            System.out.println("Mensaje: " + e.getMessage());
            
            if (e.getCause() != null) {
                System.out.println("\nExcepción original (causa): " + e.getCause().getClass().getName());
                System.out.println("Mensaje de la causa: " + e.getCause().getMessage());
            }
        }
    }
}

class ExcepcionCadenaPersonalizada extends Exception {
    public ExcepcionCadenaPersonalizada(String message) {
        super(message);
    }
    
    public ExcepcionCadenaPersonalizada(String message, Throwable cause) {
        super(message, cause);
    }
}
