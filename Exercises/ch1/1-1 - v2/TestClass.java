
/*Generic
import java.io.*;
import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.logging.*;
import java.nio.file.*;
*/

/*Best Practice*/
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;


public class TestClass{
	public static void main(String [] args) throws IOException {
		/*Ensure directory has been created */
		Files.createDirectories(Paths.get("logs"));
		/*Get the date to be used in the filename */
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
		LocalDateTime now = LocalDateTime.now();
		String date = now.format(df);
		/* Set up the filename in the logs directory */
		String logFileName = "logs\\testlog-" + date + ".txt";
		/*Set up logger */
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
		ocajLogger.addHandler(myFileHandler);
		/*log Message */
		ocajLogger.info("\nThis is a logged information message.");
		/*Close the file */
		myFileHandler.close();
	}
}