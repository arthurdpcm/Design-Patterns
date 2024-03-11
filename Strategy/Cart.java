import java.util.ArrayList;
import java.util.List;

public class Cart {

  List <Item> items;
    
  private PaymentStrategy paymentStrategy;

  public void addItem(Item item){
      items.add(item);
  }

  public void removeItem(Item item){
    items.remove(item);
  }

  public float calculateTotal(){
    float sum = 0;

    for (Item item: items){
      sum =+ item.getPrice();
    }
    return sum;

  }

  

  public Cart() {
    this.items = new ArrayList<Item>();
    
  }

  void setPaymentStrategy(PaymentStrategy paymentStrategy){
    this.paymentStrategy = paymentStrategy;
  }

  public void checkoutCart(){
    float ftotal = calculateTotal();
    paymentStrategy.pay(ftotal);    
  }

}
