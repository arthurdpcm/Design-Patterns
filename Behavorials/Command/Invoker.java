import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Invoker {

  private static Map<String, Command> commands = new HashMap<String, Command>();
  private static List<Command> history = new ArrayList<Command>();

  static{
    commands.put("A", new ACommand());
    commands.put("B", new BCommand());
  }

  public static void invoke(String command){
    commands.get(command).execute();
    history.add(commands.get(command));
    for (Command item : history){
      System.out.println(item);
    }
  }
  
}
