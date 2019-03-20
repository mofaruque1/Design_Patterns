package visitor_pattern;

public class Main {
	public static void main(String[] args) {
		UpVisitor up = new UpVisitor();
		
		FOO foo = new FOO();
		foo.accept(up);
		
		BAR bar = new BAR();
		bar.accept(up);			
	}
}
