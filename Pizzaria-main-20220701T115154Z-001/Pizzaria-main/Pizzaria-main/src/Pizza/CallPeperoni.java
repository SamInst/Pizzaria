package Pizza;
import java.util.Scanner;
public class CallPeperoni {
    public void callPizzaPepperoni() {
        NameNumber nb = new NameNumber();

        Pepperoni  p1 = new Pepperoni();
        PizzaPrice pp = new PizzaPrice();
        ConfirmBuy cb = new ConfirmBuy();


        System.out.println("Selected Pepperoni...");
        p1.PrintPepperoni();
        System.out.println("""
                Select the form of payment...
                Money(1)
                Credit Card(2)""");
        Scanner pay = new Scanner(System.in);
        int pay1 = pay.nextInt();
        switch (pay1) {
            case 1 -> {
                float sum = pp.getPricePepperoni() + pp.getPriceDelivery();
                System.out.println("Selected Money... "              + "\n" +
                        "Pizza Price: " + pp.getPricePepperoni()     + "\n" +
                        "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                        "Total Value: " + sum);
                cb.CallConfirmBuy();
                System.out.println("### Invoice: ### ");
                System.out.println("Client Name: "); nb.CallName();
                System.out.println("Phone Number: "); nb.CallNumber();
                System.out.println("Pizza Price: " + pp.getPricePepperoni()     + "\n" +
                "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                "Total Value: " + sum + "\n--------------------");
            }
            case 2 -> {
                float sum = pp.getPricePepperoni() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                System.out.println(" Selected Credit Card..."        + "\n" +
                        "Pizza Price: " + pp.getPricePepperoni()     + "\n" +
                        "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                        "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                        "Total Value: " + sum
                );
                cb.CallConfirmBuy();
                System.out.println("Invoice: "+ "\n" );
                System.out.println("Client name: "); nb.CallName();
                System.out.println("Phone Number"); nb.CallNumber();
                System.out.println(
                "Pizza Price: " + pp.getPricePepperoni()     + "\n" +
                "Delivery price: " + pp.getPriceDelivery()   + "\n" +
                "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                "Total Value: " + sum                        + "\n" +
                "--------------------");
            }
        }
    }
}