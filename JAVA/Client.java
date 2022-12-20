import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        try {
            CalcI obj=(CalcI)Naming.lookup("CALC");
            try (Scanner in = new Scanner(System.in)) {
                System.out.println("Enter the operation: + OR - OR * OR / OR 'q' OR anything to exit");
                String op=in.nextLine();
                if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
                    return;
                }
                System.out.println("Enter the first number: ");
                int num1=in.nextInt();
                System.out.println("Enter the second number: ");
                int num2=in.nextInt();
                switch (op) {
                    case "+":
                        System.out.println(obj.add(num1, num2));
                        main(args);
                        break;
                    case "-":
                        System.out.println(obj.sub(num1, num2));
                        main(args);
                        break;
                    case "*":
                        System.out.println(obj.mul(num1, num2));
                        main(args);
                        break;
                    case "/":
                        System.out.println(obj.div(num1, num2));
                        main(args);
                        break;
                    default:
                        return;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
