public class App {
    public static void main(String[] args){
        try{
        Entero nuevoInt = new Entero();
        nuevoInt.esEntero(5);
        }
        catch(IllegalArgumentException e){
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}