
public class Document {
	public Document(String name) {
		System.out.println(" Documented named ... is created");
	}
	public void load() {
		System.out.println("document ... is loaded into view");
	}
	public void spell() {
		System.out.println("document ... is being checked for spelling errors");
	}
	public void save() {
		System.out.println(" document ... is being saved...");
	}
	public void print() {
		System.out.println("document ... is printing..");
	}
}
