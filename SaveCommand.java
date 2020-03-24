/*
 * @author Camryn Reid, Jason Bell, Lauren Lee
 */
public class SaveCommand implements Command {
	private Document doc;
	public SaveCommand(Document doc) {
		this.doc = doc;
	}
	/*
	 * @param none
	 * @return void
	 */
	@Override
	public void execute() {
		doc.save();
	}
}
