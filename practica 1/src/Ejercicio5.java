public class Ejercicio5 {
    
    public void validarEdad(int edad) throws Ejercicio3 {
        if (edad < 0 || edad > 120) {
            throw new Ejercicio3("La edad debe estar entre 0 y 120 años. Valor ingresado: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }
    
    public static void main(String[] args) {
        Ejercicio5 validador = null;
        
        try {
            validador.validarEdad(25);
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getClass().getName());
            System.out.println("Mensaje: " + e.getMessage());
            
            System.out.println("\nAnálisis: Se lanzó una NullPointerException porque");
            System.out.println("intentamos llamar un método en un objeto null.");
            System.out.println("Esto es un error común en Java que ocurre en tiempo de ejecución.");
        }
    }
}
