import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* FUNCTIONS
        double x = 3.14;
        double y = -10;

       double z =  Math.max(x,y);
       double q =  Math.min(x,y);
       double p =  Math.abs(y);
       double a =  Math.sqrt(9);
       double b =  Math.round(x);
       double c =  Math.ceil(x);
       double d =  Math.floor(x);
        System.out.println(z);
        System.out.println(p);
        System.out.println(q);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);*/

        // THE HYPOTENUSE OF A TRIANGLE
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z =  Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is : "+z);
        scanner.close();
    }
}