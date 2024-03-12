package Model;
import java.util.List;

public class Facade {
  
  public static List<Client> listAllClients(){
    return Database.clients;
  }
}
