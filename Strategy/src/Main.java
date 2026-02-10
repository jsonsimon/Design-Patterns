import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Cart cart = new Cart();
        boolean keepGoing = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("How much does it cost?");
            double amount = scan.nextDouble();
            cart.addToCart(amount);
            System.out.println("Do you want to pay or add more? \n [0] Pay \n [1] Continue");
            int decide = scan.nextInt();
            if (decide == 0) {
                keepGoing = false;
            }
        }while (keepGoing);

        System.out.println("""
                What method will you pay with?
                [1] Credit Card
                [2] PayPal
                [3] Crypto
                """);
        int system = scan.nextInt();
        cart.getSystem(system);
        cart.payment();

    }

}