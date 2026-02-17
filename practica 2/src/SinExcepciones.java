public class SinExcepciones {

    //número entero válido
    public static boolean isValidInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        //números negativos
        int startIndex = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            if (str.length() == 1) {
                return false;
            }
            startIndex = 1;
        }
        
        return true;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Java Calculator operand1 operator operand2");
            System.exit(1);
        }

        if (!isValidInteger(args[0])) {
            System.out.println("Error: El operando 1 '" + args[0] + "' no es un número válido.");
            System.exit(1);
        }

        if (!isValidInteger(args[2])) {
            System.out.println("Error: El operando 2 '" + args[2] + "' no es un número válido.");
            System.exit(1);
        }


        int operand1 = Integer.parseInt(args[0]);
        int operand2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
        }

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
