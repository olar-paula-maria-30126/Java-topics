//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Garage garage = new Garage();

    Car car1 = new Car("BMW");
    Car car2 = new Car("tezla");
    garage.park(car1);
    garage.park(car2);
    }
}