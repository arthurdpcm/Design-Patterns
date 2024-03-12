import java.util.ArrayList;

public class DatabaseSingleton {

  private static DatabaseSingleton instance = null;
  private ArrayList<User> users = new ArrayList<>();
  private DatabaseSingleton(){
  }

  public static DatabaseSingleton getInstance(){
    if(instance == null){
      instance = new DatabaseSingleton();
    }
    return instance;
  }

  void add(User user){
    users.add(user);
  }

  void remove(int index){
    users.remove(index);
  }

  void show(){
    for(User user : users){
      System.out.println(user.getName() + " " + user.getAge());
    }
  }

}

