//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double x = add(2.0,3.0,1.0,9.0);
        System.out.println(x);
    }
    static int add(int a,int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    static int add(int a,int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a,int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d ;
    }

    static double add(double a,double b, double c, double d){
        System.out.println("This is overloaded method #4");
        return a + b + c + d ;
    }
}