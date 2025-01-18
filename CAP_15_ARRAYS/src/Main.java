//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* String[] cars= {"Mercedes","Tesla","Audi"};
        cars[0] = "Mustang";
        System.out.println(cars[3]);*/

        // aditional way to create an array
        String[] cars = new String[3];
        cars[0] = "A";
        cars[1] = "B";
        cars[2] = "C";

        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}