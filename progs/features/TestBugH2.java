class Main {
    public static void main(String[] args){
		System.out.println(new TestBugH2().Start());
	}
}


class TestBugH2 {
	public int Start() {

		do {
			System.out.println(1);
		} while (false);

		return 0;
	}
}
