import java.util.Scanner;

public class main{
    public static void main(String[] args){
        System.out.println("linear Equation Resolve");
        System.out.println("Given a equation 'a*x+b=c',please enter constants:*");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a : ");
        double a = scanner.nextDouble();
        System.out.println("enter b :");
        double b = scanner.nextDouble();
        System.out.println("enter c :");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (c-b)/a;
            System.out.println("Equation pass with x = " +x);
        }else {
            if (b==c){
                System.out.println("the solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
