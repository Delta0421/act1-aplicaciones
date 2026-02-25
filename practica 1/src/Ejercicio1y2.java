public class Ejercicio1y2 {
    public static void main(String[] args) {
        try {
            throw new Exception("Este es un mensaje de error personalizado");
        } catch (Exception e) {
            System.out.println("Mensaje de excepción: " + e.getMessage());
            
            System.out.println("\nStack Trace:");
            e.printStackTrace();
        } finally {
            System.out.println("\nBloque finally alcanzado - Finalizando el manejo de excepciones");
        }
    }
}
