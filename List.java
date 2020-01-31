package menus;

import java.io.File;

public class List {
	
	public static String files(String l) {
		String result="";		

		File folder = new File(System.getProperty("user.dir")+"/"+l);
		File[] listOfFiles = folder.listFiles();
		
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        result += file.getName();
		    }
		}
		return result;

	}
}

