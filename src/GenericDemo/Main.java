package GenericDemo;

public class Main {

	public static void main(String[] args) {
		
		Box<Integer> a = new Box<Integer>(12);
		System.out.println(a.getValue());
		System.out.println(a.container.getClass().getName());
		
		Box<String> s = new Box<String>("Sanil is the java programmer");
		System.out.println(s.getValue());
		System.out.println(s.container.getClass().getName());
	}

}
