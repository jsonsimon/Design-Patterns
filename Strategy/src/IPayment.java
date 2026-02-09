public interface IPayment {
    public boolean validate(double amount);
    public void processPayment(double amount);
    public String getPaymentMethodName();
}