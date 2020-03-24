/*
 * @author Camryn Reid, Jason Bell, Lauren Lee
 */
public class LoadCommand implements Command {
	private Document doc;
	public LoadCommand(Document doc) {
		this.doc = doc;
	}
	/*
	 * @param none
	 * @return void
	 */
	@Override
	public void execute() {
		doc.load();
	}
}
