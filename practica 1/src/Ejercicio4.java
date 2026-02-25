public class Ejercicio4 {
    
    public void validarEdad(int edad) throws Ejercicio3 {
        if (edad < 0 || edad > 120) {
            throw new Ejercicio3("La edad debe estar entre 0 y 120 años. Valor ingresado: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }
    
    public static void main(String[] args) {
        Ejercicio4 validador = new Ejercicio4();
        
        try {
            validador.validarEdad(150);
        } catch (Ejercicio3 e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
