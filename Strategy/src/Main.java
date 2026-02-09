import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much are you going to pay?");
        double amount = scan.nextDouble();
        System.out.println("""
                What method will you pay with?
                [1] Credit Card
                [2] PayPal
                [3] Crypto
                """);
        int system = scan.nextInt();
        IPayment paySystem = getSystem(system);
        paySystem.processPayment(amount);

    }
    private static IPayment getSystem(int system){
        switch (system){
            case 1:
                return new CreditCard();
            case 2:
                return new PayPal();
            case 3:
                return new Crypto();
            default:
                return null;
        }
    }
}