//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] cars ={{"Camaro","Corvette","Silverado"},
                          {"Mustang","Ranger","F-150"},
                          {"Ferrari","Lambo","Tesla"}
                         };
       /* cars[0][0] =  "Camaro";
        cars[0][1] =  ;"Corvette"
        cars[0][2] =  "Silverado";

        cars[1][0] =  "Mustang";
        cars[1][1] =  "Ranger";
        cars[1][2] =  "F-150";

        cars[2][0] =  "Ferrari";
        cars[2][1] =  "Lambo";
        cars[2][2] =  "Tesla";*/

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}