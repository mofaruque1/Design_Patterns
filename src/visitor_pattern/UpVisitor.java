package visitor_pattern;

public class UpVisitor implements Visitor {

	@Override
	public void visit(FOO foo) {
		System.out.println("do Up on " + foo.getFOO());
	}
	@Override
	 public void visit(BAR bar) {
	        System.out.println("do Up on " + bar.getBAR());
	    }


}
