import java.sql.Date;

public class CreditCard implements PaymentStrategy{

  private String fullName;
  private String cardNumber;
  private String cvv;
  private String dateOfExpiry;


  public CreditCard(String fullName, String cardNumber, String cvv, String date) {
    this.fullName = fullName;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.dateOfExpiry = date;
  }

  public void pay(float amount){
      System.out.println(amount + "paid using Credit Card ");
  }



}
