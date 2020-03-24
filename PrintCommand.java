/*
 * @author Camryn Reid, Jason Bell, Lauren Lee
 */
public class PrintCommand implements Command {
	private Document doc;
	public PrintCommand(Document doc) {
		this.doc = doc;
	}
	/*
	 * @param none
	 * @return void
	 */
	@Override
	public void execute() {
		doc.print();
	}
}
