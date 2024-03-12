package Control;
import java.util.List;

import Model.Client;
import Model.Facade;

public class ClientService {
  public List<Client> listAllClients(){
    return Facade.listAllClients();
  } 
}
