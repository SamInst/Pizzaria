package Pizza;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        NameNumber nN = new NameNumber();
        System.out.println(
                "Welcome to Sam's Pizzeria! \n " +
                "Please digit your name and number to proceed the buy... \n ");
        nN.CallNameNumber();

        System.out.println("How many flavors of pizza? ");
        Scanner fv = new Scanner(System.in);
        int vf = fv.nextInt();

        switch (vf){
            case 1 ->{
                System.out.println("""
                ____________________________ \n
                Choose your Pizza flavor:\s
                tap 0 to Cancel!!!\s
                1- Portuguese 2- Pepperoni 3- Cheese
                """);
                CallPortuguese a = new CallPortuguese();
                CallPeperoni b = new CallPeperoni();
                CallCheese c = new CallCheese();

                Scanner sc0 = new Scanner(System.in);
                int esc = sc0.nextInt();
                switch (esc) {
                    case 1 -> {a.callPizzaPortuguese();}
                    case 2 -> {b.callPizzaPepperoni();}
                    case 3 -> {c.callPizzaCheese();}
                }
            }
            case 2 ->{
                System.out.println("""
                ____________________________ \n
                Choose your Pizza flavor one:\s
                tap 0 to Cancel!!!\s
                1- Portuguese 2- Pepperoni 3- Cheese
                """);

                CallPortuguese a = new CallPortuguese();
                CallPeperoni b = new CallPeperoni();
                CallCheese c = new CallCheese();

                Scanner sc0 = new Scanner(System.in);
                int esc = sc0.nextInt();
                switch (esc) {
                    case 1 -> {a.callPizzaPortuguese();}
                    case 2 -> {b.callPizzaPepperoni();}
                    case 3 -> {c.callPizzaCheese();}
                }
                System.out.println("""
                ____________________________ \n
                Choose your Pizza flavor two: \s
                tap 0 to Cancel!!!\s
                1- Portuguese 2- Pepperoni 3- Cheese
                """);
            }
            default -> {
                System.out.println("We don't make more than 2 flavors ... Sorry :/");
            }
        }






    }
}