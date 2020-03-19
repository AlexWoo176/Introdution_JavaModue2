package equation.resolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter Number a: ");
        a = sc.nextDouble();
        System.out.print("Enter Number b: ");
        b = sc.nextDouble();
        System.out.print("Enter Number c: ");
        c = sc.nextDouble();

        if(a != 0) {
            double solution = (c - b)/a;
            System.out.printf("The Solution is: %f!\n", solution);
        } else {
            if(b == 0) {
                System.out.print("The Solution is all x!");
            } else {
                System.out.print("No Solution!");
            }
        }
    }
}
