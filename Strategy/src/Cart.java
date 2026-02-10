public class Cart {
    int amountInCart = 0;
    double price = 0;
    private IPayment Pay;

    public void getSystem(int system) {
        switch (system) {
            case 1:
                this.Pay = new CreditCard();
                break;
            case 2:
                this.Pay = new PayPal();
                break;
            case 3:
                this.Pay = new Crypto();
                break;
        }
    }
    public void payment(){
        if(Pay == null){
            return;
        }
        Pay.processPayment(price);
        System.out.println("Bought " + amountInCart + " items");
        this.price = 0;
        this.amountInCart = 0;
        Pay = null;
    }
    public void addToCart(double price){
        amountInCart ++;
        this.price += price;
    }

}