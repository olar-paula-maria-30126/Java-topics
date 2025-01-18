//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Paula",20,47);
        Human human2 = new Human("Ada",19,51);
        System.out.println(human2.name);

        human2.eat();
        human1.drink();
    }
}