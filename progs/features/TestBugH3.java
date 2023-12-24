class Main {
    public static void main(String[] args){
		System.out.println(new TestBugH3().Start(10));
	}
}


class TestBugH3 {
	public int Start(int count) {

		boolean flag;

		int counter;
		counter = 0;

		do {
			System.out.println(counter);

			counter = counter + 1;

		} while(counter < count);

		return 0;
	}
}
