import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:/Users/chele/Desktop/apps escritorio/anotaciones_clase/src/prueba.txt");
            out = new FileOutputStream("C:/Users/chele/Desktop/apps escritorio/anotaciones_clase/src/byteprueba.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }catch(IOException ex){
            System.out.println("Error: no fue posible instanciar el objeto in");
            System.out.println(ex.getMessage());

            ex.getMessage();
            ex.printStackTrace();
        
        } finally {
            if (in != null) { 
                in.close(); 
            }
            if (out != null) {
                out.close();
            }
        }
    }
}