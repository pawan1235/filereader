import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilderTask implements Runnable{

	@Override
	public String run() {
		StringBuilder data = new StringBuilder();
		String filename = "Alice-in-Wonderland.txt";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while ((c = reader.read()) >= 0) {
				data = data.append((char) c);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		try {
			in.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return data.toString();
	}
	@Override
	public String toString() {
		Stopwatch timer = new Stopwatch();
		AppendStringBuilderTask file = new AppendStringBuilderTask();
		timer.start();
		String data = file.run();
		timer.stop();
		return String.format(
				"Reading Alice-in-Wonderland.txt using FileReader,append to StringBuilder.\nRead %d chars in %f sec.\n",
				data.length(), timer.getElapsed());
	}

}
