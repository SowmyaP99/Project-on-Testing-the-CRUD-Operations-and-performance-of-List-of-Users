

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PropertyConfigurator.configure("LogFile.properties");
//		Logger logger = Logger.getLogger(TestLogFiles.class.getName());
//		
//     	logger.debug("Debugging");
//
//		logger.info("Info for run");
		
		PropertyConfigurator.configure("LogFile.properties");
		Logger logger = org.apache.log4j.Logger.getLogger(TestLogFiles.class.getName());
		logger.debug("Debugging");
		logger.info("Into for run");
		
		
		
	}
}
