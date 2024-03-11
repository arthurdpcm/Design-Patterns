import java.util.Date;

public class main {
  
  public static void main(String[] args) {
    Cart cart = new Cart();
    Item item1 = new Item("1234",10);
    Item item2 = new Item("5678",40);
    
    cart.addItem(item1);
    cart.addItem(item2);
    

    cart.setPaymentStrategy(new PayPal("Arthur", "password"));
    cart.checkoutCart();


    Item item4 = new Item("9123",60);
    cart.addItem(item4);

    cart.setPaymentStrategy(new CreditCard("Arthur", "1234567890123456", "786", "15/12/2028"));
    cart.checkoutCart();

  }
}