public class Client {
  
  public static void main(String[] args){

    Invoker.invoke("A");
    Invoker.invoke("B");
    Invoker.invoke("A");
    Invoker.invoke("B");
    Invoker.invoke("A");
    Invoker.invoke("B");
  }
}
