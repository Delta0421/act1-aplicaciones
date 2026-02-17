public class ConExcepciones {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Java Calculator operand1 operator operand2");
            System.exit(1);
        }

        int result = 0;

        try {
            int operand1 = Integer.parseInt(args[0]);
            int operand2 = Integer.parseInt(args[2]);

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
                default:
                    break;
            }

            System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);

        } catch (NumberFormatException e) {

            try {
                Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                System.out.println("Error: El operando 1 '" + args[0] + "' no es un número válido.");
                System.exit(1);
            }

            try {
                Integer.parseInt(args[2]);
            } catch (NumberFormatException ex) {
                System.out.println("Error: El operando 2 '" + args[2] + "' no es un número válido.");
                System.exit(1);
            }
        }
    }
}
