import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        String[] ranks = {"asistente", "asociado", "titular"};
        double[][] salaryRanges = {
            {50000, 80000},      // asistente
            {60000, 110000},     // asociado
            {75000, 130000}      // titular
        };
        
        Random random = new Random();
        
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("salarios.txt"))) {
            for (int i = 1; i <= 1000; i++) {
                String nombre = "Nombre" + i;
                String apellido = "Apellido" + i;
                
                // Seleccionar rango aleatorio
                int rankIndex = random.nextInt(3);
                String rank = ranks[rankIndex];
                
                // Generar salario aleatorio basado en el rango
                double minSalary = salaryRanges[rankIndex][0];
                double maxSalary = salaryRanges[rankIndex][1];
                double salary = minSalary + (maxSalary - minSalary) * random.nextDouble();
                
                // Escribir línea con formato: Nombre Apellido Rango Salario
                writer.printf("%s %s %s %.2f%n", nombre, apellido, rank, salary);
            }
            System.out.println("Archivo salarios.txt creado exitosamente con 1000 líneas.");
        }
    }
}
