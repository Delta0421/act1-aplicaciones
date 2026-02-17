import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        calc contador = new calc();
        
        System.out.println("Ingrese el número del candidato por cada voto.");
        System.out.println("Escriba 0 cuando termine de contar los votos.\n");
        
        int candidato;
        while (true) {
            System.out.print("Candidato: ");
            candidato = scanner.nextInt();
            
            if (candidato == 0) {
                break;
            }
            
            contador.registrarVoto(candidato);
        }
        
        contador.mostrarResultados();
        scanner.close();
    }
}
