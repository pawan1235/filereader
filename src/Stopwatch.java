
public class Stopwatch {
	private long start;
	private long stop;
	private static final double NANO =  1.0E-9;
	private boolean running = false;

	public void start() {
		if(!running) {
			this.start = System.nanoTime();			
			this.running = true;
		}
	}

	public void stop() {
		if(running) {
			this.stop = System.nanoTime();
			this.running = false;			
		}
	}

	public boolean isRunning() {
		return this.running;
	}

	public double getElapsed() {
		if(running) {
			return (System.nanoTime() - this.start)*NANO;
		}
		return (this.stop - this.start)*NANO;
	}

	public static void main(String[] args) {
		Stopwatch a = new Stopwatch();
		a.start();
		System.out.println(a.start);
		
//		a.stop();
//		System.out.println(a.stop);
		System.out.print(a.getElapsed());
	}

}
