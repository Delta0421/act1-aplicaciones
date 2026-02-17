public class Entero {
    private int numero;
    
    public Entero(){}

    public Entero(int numero){
        this.numero = numero;
    }

    public void esEntero(int numero) throws IllegalArgumentException{      
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("El número es impar");
        }
        System.out.println("El número es par");   
    }
}