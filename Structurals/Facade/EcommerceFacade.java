package Facade;
import Facade.Stock;
import Facade.Payment;
import Facade.Shipping;


public class EcommerceFacade{
  private Stock stock;
  private Payment payment;
  private Shipping shipping;

  public EcommerceFacade(){
    stock = new Stock();
    payment = new Payment();
    shipping = new Shipping();
  }

  public void processProduct(String productId, String userId){
    if(stock.checkStock(productId) && payment.processPayment(userId)){
      shipping.shipProduct(productId, userId);
    } else {
      System.out.println("Product not available or payment not allowed");
    }
  }

}