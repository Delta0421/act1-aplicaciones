public class calc {

    private int[] votos;
    private int totalVotos;
    private int maxCandidatos;
    
    public calc() {
        maxCandidatos = 100;
        votos = new int[maxCandidatos + 1];
        totalVotos = 0;
    }
    
    public void registrarVoto(int candidato) {
        if (candidato > 0 && candidato <= maxCandidatos) {
            votos[candidato]++;
            totalVotos++;
        }
    }
    
    public void mostrarResultados() {
        if (totalVotos == 0) {
            System.out.println("No hay votos registrados.");
            return;
        }
        
        System.out.println("Total de votos: " + totalVotos);
        
        for (int i = 1; i <= maxCandidatos; i++) {
            if (votos[i] > 0) {
                double porcentaje = (votos[i] * 100.0) / totalVotos;
                System.out.println("Candidato " + i + ": " + votos[i] + " votos (" + porcentaje + "%)");
            }
        }

    }
}
