public class Main {
  public static void main(String[] args) {
    DatabaseSingleton databaseSingleton = DatabaseSingleton.getInstance();
    databaseSingleton.add(new User("John", 30));
    databaseSingleton.add(new User("Jane", 25));
    databaseSingleton.show();
    databaseSingleton.remove(1);
    databaseSingleton.add(new User("Mary", 35));
    databaseSingleton.show();
  }
}
