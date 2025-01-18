import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String name ="";

        do {
            System.out.println("enter your name:");
            name = scanner.nextLine();
        }while(name.isBlank());
        System.out.println("Hello "+name);*/
        // Cap_13_FOOR_LOOP
        for(int i = 10;i>=0; ){
            System.out.println(i);
            i-=2;
        }
        System.out.println("Happy Tuesday! ");
    }
}