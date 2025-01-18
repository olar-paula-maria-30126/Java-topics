//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        System.out.println(myCar1.model);
        System.out.println(myCar1.make);
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        myCar1.drive();
        myCar1.brake();
    }
}