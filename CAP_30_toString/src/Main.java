import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Car car = new Car();

        /*System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);*/


        System.out.println(car.toString()); // expicitly use of the toString method
        System.out.println(car); //implicitly
    }
}