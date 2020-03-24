
public class Document {
	static String Name;
	public Document(String name) {
		System.out.println("Documented named " + name + " is created");
		Name = name;
	}
	
	public static void load() {
		System.out.println("document " + Name +  " is loaded into view");
	}
	public static void spell() {
		System.out.println("document " + Name + " is being checked for spelling errors");
	}
	public static void save() {
		System.out.println("document " + Name + " is being saved...");
	}
	public static void print() {
		System.out.println("document " + Name + " is printing..");
	}
}
