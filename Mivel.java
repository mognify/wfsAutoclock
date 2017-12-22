import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mivel {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		pln("> Detect operating system");
		String os = System.getProperty("os.name").toLowerCase();
		pln("... operating system identified as " + os);
		
		if(os.contains("mac") || os.contains("windows")){
		    pln("> Grab \"wfs.txt\" from " + os + " desktop");
		    String desktop = System.getProperty("user.home") + "/Desktop/";
		    File wfs = new File(desktop + "wfs.txt");
		    Scanner fileScanner = new Scanner(System.in);
		    try {
			fileScanner = new Scanner(wfs);
		    } catch (FileNotFoundException e) {
			pln("!.. unable to read from file, program stopping.");
			fileScanner.close();
			System.exit(0);
		    }
		    pln("... first line from file: " + fileScanner.nextLine());
		    fileScanner.close();

		    Scanner inputScanner = new Scanner(System.in);
		    pln("> \"Would you like to create [T]imers or [A]larms?\"");
		    String response = inputScanner.nextLine().toLowerCase();
		    if(response.equals("t"))
			createTimers(wfs);
		    else if(response.equals("a"))
			createAlarms(wfs);
		    else
			pln("... invalid choice");
		}else{
		    pln("!.. " + os + " is not a compatible operating system."
		    	+ "\n!.. incompatible operating system program stopping...");
		    System.exit(0);
		}
	}
	
	public static void createTimers(File wfs){
	    
	}
	
	public static void createAlarms(File wfs){
	    
	}
	
	public static void pln(String s){
		System.out.println(s);
	}
}
