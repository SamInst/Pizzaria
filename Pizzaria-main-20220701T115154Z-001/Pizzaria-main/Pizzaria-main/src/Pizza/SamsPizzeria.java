package Pizza;

import java.util.Scanner;

public class SamsPizzeria {
    public void NameNumber() {
        int esc, pay1;
        System.out.println("Your name: ");
        Scanner sc4 = new Scanner(System.in);
        String sc1 = sc4.nextLine();

        System.out.println("You number: ");
        Scanner sc3 = new Scanner(System.in);
        Long sc2 = sc3.nextLong();

        //----------------------------------------------------------------------------------------------------------------------
        Scanner sc0 = new Scanner(System.in);
        esc = sc0.nextInt();
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

                        System.out.println("Confirm the buy? [y/n]");
                        Scanner y = new Scanner(System.in);
                        String lt = y.nextLine();
                        if (lt.equals("y") || lt.equals("Y")) {
                            System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                            System.out.println("Invoice: \n" +
                                    "-------------------- \n" +
                                    "Client name: " + sc1 + "\n"+
                                    "Phone number: " + sc2 + "\n"+
                                    "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------"
                            );
                        } else if (lt.equals("n") || lt.equals("N")) {
                            System.out.println("Order Canceled, Please Return to beginning");

                        } else {
                            System.out.println("Confirm? [y/n]");
                            Scanner y1 = new Scanner(System.in);
                            lt = y1.nextLine();

                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Client name: " + sc1 + "\n" +
                                        "Phone number: " + sc2 + "\n" +
                                        "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------"
                                );
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        }
                    }
                    case 2 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = pp.getPricePortuguese() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                        System.out.println(" Selected Credit Card... \n" +
                                "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                "Total Value: " + sum
                        );
                        String lt;
                        System.out.println("Confirm the buy?? [y/n]");
                        Scanner y = new Scanner(System.in);
                        lt = y.nextLine();

                        if (lt.equals("y") || lt.equals("Y")) {
                            System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                            System.out.println("Invoice: \n" +
                                    "--------------------" +
                                    "Client name: " + sc1 + "\n" +
                                    "Phone number: " + sc2 + "\n" +
                                    "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                    "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------"
                            );
                        } else if (lt.equals("n") || lt.equals("N")) {
                            System.out.println("Order Canceled, Please Return to beginning");
                        } else {
                            System.out.println("Confirm? [y/n]");
                            Scanner y1 = new Scanner(System.in);
                            lt = y1.nextLine();

                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Client name: " + sc1 + "\n" +
                                        "Phone number: " + sc2 +"\n" +
                                        "Pizza Price: " + pp.getPricePortuguese() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                        "Total Value: " + sum + "\n--------------------"
                                );
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        }
                    }
                }
            }
//----------------------------------------------------------------------------------------------------------------------
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
                        System.out.println("Confirm the buy? [y/n]");
                        Scanner y = new Scanner(System.in);
                        lt = y.nextLine();
                        if (lt.equals("y") || lt.equals("Y")) {
                            System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                            System.out.println("Invoice: \n" +
                                    "-------------------- \n" +
                                    "Client name: " + sc1 +
                                    "Phone number: " + sc2 +
                                    "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------"
                            );
                        } else if (lt.equals("n") || lt.equals("N")) {
                            System.out.println("Order Canceled, Please Return to beginning");
                        } else {
                            System.out.println("Confirm? [y/n]");
                            Scanner y1 = new Scanner(System.in);
                            lt = y1.nextLine();
                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Client name: " + sc1 + "\n" +
                                        "Phone number: " + sc2 + "\n" +
                                        "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------"
                                );
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        }
                    }
                    case 2 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = pp.getPricePepperoni() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                        System.out.println(" Selected Credit Card... \n" +
                                "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                "Total Value: " + sum
                        );
                        String lt;
                        System.out.println("Confirm the buy?? [y/n]");
                        Scanner y = new Scanner(System.in);
                        lt = y.nextLine();
                        if (lt.equals("y") || lt.equals("Y")) {
                            System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                            System.out.println("Invoice: \n" +
                                    "--------------------" +
                                    "Client name: " + sc1 + "\n" +
                                    "Phone number: " + sc2 + "\n" +
                                    "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                    "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------"
                            );
                        } else if (lt.equals("n") || lt.equals("N")) {
                            System.out.println("Order Canceled, Please Return to beginning");
                        } else {
                            System.out.println("Confirm? [y/n]");
                            Scanner y1 = new Scanner(System.in);
                            lt = y1.nextLine();
                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Client name: " + sc1 + "\n" +
                                        "Phone number: " + sc2 +"\n" +
                                        "Pizza Price: " + pp.getPricePepperoni() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                        "Total Value: " + sum + "\n--------------------"
                                );
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        }
                    }
                }
            }
            //---------------------------------------------------------------------------------------------------------
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
                        String lt;
                        System.out.println("Confirm the buy? [y/n]");
                        Scanner y = new Scanner(System.in);
                        lt = y.nextLine();
                        if (lt.equals("y") || lt.equals("Y")) {
                            System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                            System.out.println("Invoice: \n" +
                                    "-------------------- \n" +
                                    "Client name: " + sc1 +
                                    "Phone number: " + sc2 +
                                    "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------"
                            );
                        } else if (lt.equals("n") || lt.equals("N")) {
                            System.out.println("Order Canceled, Please Return to beginning");
                        } else {
                            System.out.println("Confirm? [y/n]");
                            Scanner y1 = new Scanner(System.in);
                            lt = y1.nextLine();
                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Client name: " + sc1 + "\n" +
                                        "Phone number: " + sc2 + "\n" +
                                        "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------");
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        }
                    }
                    case 2 -> {
                        PizzaPrice pp = new PizzaPrice();
                        float sum = pp.getPriceCheese() + pp.getPriceDelivery() + pp.getPriceCardInterest();
                        System.out.println(" Selected Credit Card... \n" +
                                "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                "Total Value: " + sum);
                        String lt;
                        System.out.println("Confirm the buy?? [y/n]");
                        Scanner y = new Scanner(System.in);
                        lt = y.nextLine();
                        if (lt.equals("y") || lt.equals("Y")) {
                            System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                            System.out.println("Invoice: \n" +
                                    "--------------------" +
                                    "Client name: " + sc1 + "\n" +
                                    "Phone number: " + sc2 + "\n" +
                                    "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                    "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                    "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                    "Total Value: " + sum + "\n" + "Sam's Pizzeria" + "\n" + "--------------------");
                        } else if (lt.equals("n") || lt.equals("N")) {
                            System.out.println("Order Canceled, Please Return to beginning");
                        } else {
                            System.out.println("Confirm? [y/n]");
                            Scanner y1 = new Scanner(System.in);
                            lt = y1.nextLine();
                            if (lt.equals("y") || lt.equals("Y")) {
                                System.out.println("Order Made! \n Now just wait to everything get ready! thanks! :D ");
                                System.out.println("Invoice: \n" +
                                        "-------------------- \n" +
                                        "Client name: " + sc1 + "\n" +
                                        "Phone number: " + sc2 +"\n" +
                                        "Pizza Price: " + pp.getPriceCheese() + "\n" +
                                        "Delivery price: " + pp.getPriceDelivery() + "\n" +
                                        "CardInterest: " + pp.getPriceCardInterest() + "\n" +
                                        "Total Value: " + sum + "\n--------------------");
                            } else if (lt.equals("n") || lt.equals("N")) {
                                System.out.println("Order Canceled, Please Return to beginning");
                            }
                        }
                    }
                }
            }
        }
    }
}