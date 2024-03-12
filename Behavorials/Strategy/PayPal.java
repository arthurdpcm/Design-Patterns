public class PayPal implements PaymentStrategy{
    private String emailId;
    private String password;
  
    public PayPal(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }
  
    public void pay(float amount){
        System.out.println(amount + " paid using PayPal.");
    }
}
