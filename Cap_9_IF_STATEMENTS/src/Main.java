//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 75;

        if(age==75) {
            System.out.println("Azi o sa fie bine la dobra:)");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age>=13){
            System.out.println("You are a teenager!");
        }
        else{
            System.out.println("You are not an adult!");
        }
    }
}