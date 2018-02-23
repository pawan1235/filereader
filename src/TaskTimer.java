
public class TaskTimer {
	public static void main(String[] args) {
//		Stopwatch timer = new Stopwatch();
		AppendStringTask a = new AppendStringTask();
		System.out.println(a);
		String af = a.run();
		AppendStringBuilderTask b = new AppendStringBuilderTask();
		System.out.print(b);
		AppendLineString c = new AppendLineString();
		System.out.println(c);

	}
}
