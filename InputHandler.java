import java.util.HashMap;
public class InputHandler {

	private HashMap<Command, String> commands = new HashMap<Command, String>();

	public InputHandler(Document document) {
		LoadCommand loadCommand = new LoadCommand(document);
		commands.put(loadCommand, "load");
		
		PrintCommand printCommand = new PrintCommand(document);
		commands.put(printCommand, "print");
		
		SaveCommand saveCommand = new SaveCommand(document);
		commands.put(saveCommand, "save");
		
		SpellCommand spellCommand = new SpellCommand(document);
		commands.put(spellCommand, "spell");
	}
	public void inputEntered(String command) {
		if (command.equals("load")) {
			Document.load();
		}
		
		else if (command.equals("print")) {
			Document.print();
		}
		
		else if (command.equals("save")) {
			Document.save();
		}
		
		else if (command.equals("spell")) {
			Document.spell();
		}
		
		else if (command.equals("quit")) {
			System.out.println("Goodbye");
		}
		
		else {
			System.out.println("Sorry, we don't recognize that command");
		}
	}
}
