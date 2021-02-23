package JavaCore.synchronizedBlocks;

public class app {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		var t1 = new SimpleRunnable("#1", num);
		var t2 = new SimpleRunnable("#2", num);

		System.out.println(t1.toString() + t2);;
	}
}
