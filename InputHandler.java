import java.util.HashMap;
public class InputHandler {
	public InputHandler(Document document) {
		HashMap<Command, String> commands = new HashMap<Command, String>(); 
		commands.put(, "Load");
	    commands.put(, "Save");
	    commands.put(, "Spell");
	    commands.put(, "Print");
	    System.out.println(commands);
	}
	public void inputEntered(String data) {
		
	}
}