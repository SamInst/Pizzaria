package Pizza;
import java.util.Scanner;
public class SamsPizzeria {
    public static void main(String[] args) {
        int esc, pay1;
        System.out.println("""
                Welcome to Sam's Pizzeria!
                ____________________________
                Choose your Pizza flavor:\s
                tap 0 to Cancel!!!\s
                1- Portuguese 2- Pepperoni 3- Cheese
                """);
        Scanner sc1 = new Scanner(System.in);
        esc = sc1.nextInt();
        switch (esc) {
            case 1 -> {
                Portuguese p1 = new Portuguese();
                System.out.println("Selected Portuguese...");
                p1.PrintPortuguese();
                System.out.println("""
                        Select the form of payment...
                        Money(1)
                        Credit Card(2)""");
                Scanner pay = new Scanner(System.in);
                pay1 = pay.nextInt();
                switch (pay1) {
                    case 1 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = (pp.getPricePortuguese() + pp.getPriceDelivery());
                        System.out.println("Selected Money... \n" +
                                "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "Total Value: " + sum);
                        String lt;
                        do {
                            System.out.println("Confirm? [y/n]");
                            Scanner y = new Scanner(System.in);
                            lt = y.nextLine();
                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "Total Value: " + sum + "\n--------------------"
                                );
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        } while (lt != "y" && lt != "n" && lt != "Y" && lt != "N");
                    }





                    case 2 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = pp.getPricePortuguese() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                        System.out.println(" Selected Credit Card... \n" +
                                "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "CardInterest: " + pp.getPriceCardInterest() +"\n" +
                                "Total Value: " + sum
                        );
                        String lt;
                        do {
                            System.out.println("Confirm? [y/n]");
                            Scanner y = new Scanner(System.in);
                            lt = y.nextLine();

                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "--------------------" +
                                        "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "CardInterest: " + pp.getPriceCardInterest() +"\n" +
                                        "Total Value: " + sum + "\n" + "--------------------"
                                );
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        } while (lt == "y" && lt == "n" && lt == "Y" && lt == "N");
                    }
                }
            }




















            case 2 -> {
                Pepperoni p1 = new Pepperoni();
                System.out.println("Selected Pepperoni...");
                p1.PrintPepperoni();
                System.out.println("""
                        Select the form of payment...
                        Money(1)
                        Credit Card(2)""");
                Scanner pay = new Scanner(System.in);
                pay1 = pay.nextInt();
                switch (pay1) {
                    case 1 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = (pp.getPricePepperoni() + pp.getPriceDelivery());
                        System.out.println("Selected Money... \n" +
                                "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "Total Value: " + sum);
                        String lt;
                        do {
                            System.out.println("Confirm? [y/n]");
                            Scanner y = new Scanner(System.in);
                            lt = y.nextLine();
                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "Total Value: " + sum + "\n--------------------"

                                );
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");

                            } else {
                                System.out.println("Invalid Option ");

                            }
                        } while (lt == "y" && lt == "n" && lt == "Y" && lt == "N");
                    }
                    case 2 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = pp.getPricePepperoni() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                        System.out.println(" Selected Credit Card... \n" +
                                "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "Total Value: " + sum
                        );
                        Scanner s = null;
                        String lt = s.nextLine();
                        do {
                            System.out.println("Confirm? [y/n]");
                            s = new Scanner(System.in);


                            if (lt.equals("s") || lt.equals("S")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "--------------------" +
                                        "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "Total Value: " + sum + "\n" + "--------------------"
                                );
                            } else {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        } while (lt == "y" && lt == "n" && lt == "Y" && lt == "N");
                    }
                }
            }
            case 3 -> {
                Cheese c1 = new Cheese();
                System.out.println("Selected Cheese...");
                c1.PrintCheese();
                System.out.println("""
                        Select the form of payment...
                        Money(1)
                        Credit Card(2)""");
                Scanner pay = new Scanner(System.in);
                pay1 = pay.nextInt();
                switch (pay1) {
                    case 1 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = (pp.getPriceCheese() + pp.getPriceDelivery());
                        System.out.println("Selected Money... \n" +
                                "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "Total Value: " + sum);
                    }
                    case 2 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = pp.getPriceCheese() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                        System.out.println(" Selected Credit Card... \n" +
                                "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "Total Value: " + sum
                        );
                        System.out.println("Confirm? [y/n]");
                        Scanner s = new Scanner(System.in);
                        String lt = s.nextLine();

                        if (lt.equals("s") || lt.equals("S")) {
                            System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                            System.out.println("Invoice: \n" +
                                    "--------------------" +
                                    "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "Total Value: " + sum + "\n" + "--------------------"
                            );
                        } else {
                            System.out.println("Order Canceled, Please Return to beginning");
                        }
                    }
                }
            }
        }
    }
}