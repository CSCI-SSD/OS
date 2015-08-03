import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * @author kartheek
 *
 */
public class prog2 {
	
	
	public static final int  MAXCPU = 4 ;       /* limit from problem statement */
	public static final int  MAXPROC = 25;      /* limit from problem statement */

	/* Process states */
	public static final int  NOTYETSUBMITTED = 1;
	public static final int  READY = 2;
	public static final int  RUNNING = 3;
	public static final int  BLOCKED = 4;
	public static final int  COMPLETED =5;

	
	int casenum;            /* simulation case # */
	int last_t;             /* time of previous event */
	int t;                  /* simulation time (current event time) */
	int nfinished;          /* # of procs in COMPLETED state */

	int num_cpu;            /* # of CPUs in current simulation */
	int num_proc;           /* # of processes (from input data) */
	int quantum;            /* quantum size (from input data) */

	/**
	 * 
	 * @param fileName
	 */
	public void readFile(String fileName) {

		BufferedReader buffRead = null;
		try {
			buffRead = new BufferedReader(new FileReader(fileName));
			String data = null;
			while ((data = buffRead.readLine()) != null) {
				print(data);
			}
		} catch (IOException ioe) {
			print("Error in Extracting File Data " + fileName);
		} finally {
			if (buffRead != null) {
				try {
					buffRead.close();
				} catch (Exception dummy) {
				}
			}
		}

	}
	
	/**
	 * 
	 * @param fileName
	 * @return true : If file exists other wise false
	 */
	public boolean fileExists(String fileName) {
		File file = new File(fileName);
		if (file.exists() && file.isFile()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	/**
	 * 
	 * @param message
	 * 
	 *  Print message to console
	 */
	public static void print(String message) {
		System.out.println(message);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}
