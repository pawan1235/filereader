import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppendLineString implements Runnable{

	@Override
	public String run() {
		BufferedReader br = null;
		String data = "";
		try {
			String line = "";
//			File file = new File("Alice-in-Wonderland.txt");
			FileReader file = new FileReader("Alice-in-Wonderland.txt");
			br = new BufferedReader(file);
			while((line = br.readLine()) != null) {
				data += line + "\n";
			}
			if(br != null)
				br.close();
		}catch (IOException e) {
			System.out.println("Return an empty string.");
		} 
		return data;
	}

	@Override
	public String toString() {
		Stopwatch timer = new Stopwatch();
		AppendLineString file = new AppendLineString();
		timer.start();
		String data = file.run();
		timer.stop();
		return String.format(
				"Reading Alice-in-Wonderland.txt using BufferedReader,append lines to String.\nRead %d chars in %f sec.\n",
				data.length(), timer.getElapsed());
	}
}
