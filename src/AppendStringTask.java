import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable {

	@Override
	public String run() {
		String data = "";
		String filename = "Alice-in-Wonderland.txt";
		InputStream in = null;
		try {
			in = new FileInputStream(filename);
			InputStreamReader reader = new InputStreamReader(in);
			int c;
			while ((c = reader.read()) >= 0) {
				data += (char) c;
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
		return data;
	}

	@Override
	public String toString() {
		Stopwatch timer = new Stopwatch();
		AppendStringTask file = new AppendStringTask();
		timer.start();
		String data = file.run();
		timer.stop();
		return String.format(
				"Reading Alice-in-Wonderland.txt using FileReader,append to String.\nRead %d chars in %f sec.",
				data.length(),timer.getElapsed());
	}

}
