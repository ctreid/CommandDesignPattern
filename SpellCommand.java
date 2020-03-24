/*
 * @author Camryn Reid, Jason Bell, Lauren Lee
 */
public class SpellCommand implements Command {
	private Document doc;
	public SpellCommand(Document doc) {
		this.doc = doc;
	}
	/*
	 * @param none
	 * @return void
	 */
	@Override
	public void execute() {
		doc.spell();
	}
}
