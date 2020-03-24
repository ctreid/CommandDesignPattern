/*
 * @author Jason Bell, Camryn Reid, Lauren Lee
 * /
public class Document {
	static String Name;
	public Document(String name) {
		System.out.println("Documented named " + name + " is created");
		Name = name;
	}
	
	/ * 
	  * @param none
	  * @return void
	  * /
	public static void load() {
		System.out.println("document " + Name +  " is loaded into view");
	}
	
	/ * 
	  * @param none
	  * @return void
	  * /
	public static void spell() {
		System.out.println("document " + Name + " is being checked for spelling errors");
	}
	
	/ *
	  * @param none
	  * @return void
	  * /
	public static void save() {
		System.out.println("document " + Name + " is being saved...");
	}
	
	/ * 
	  * @param none
	  * @return void
	  * /
	public static void print() {
		System.out.println("document " + Name + " is printing..");
	}
}
