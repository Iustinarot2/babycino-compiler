class Main {
    public static void main(String[] args){
		System.out.println(new TestBugH1().Start());
	}
}


class TestBugH1 {
	public int Start() {

		int expr;
		expr = 1;

		do {

		} while(expr);

		return 0;
	}
}
