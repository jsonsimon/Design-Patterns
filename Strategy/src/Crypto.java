public class Crypto implements IPayment {
    double amount;
    public boolean validate(double amount){
        if(amount>0){
            return true;
        }else {
            return false;
        }
    }
    public void processPayment(double amount){
        if(validate(amount)){
            System.out.println("Paying $" + amount + " using " + getPaymentMethodName() + "...");
            System.out.println("Payment went through, email confirmation has been sent.");
        }else{
            System.out.println("Payment failed");
        }
    }
    public String getPaymentMethodName(){
        return "Crypto";
    }

}
