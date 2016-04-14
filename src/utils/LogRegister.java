package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class LogRegister {
	private String fileName = "log.txt";
	
	public LogRegister() {
	}
	
	public LogRegister(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public void registerAction(String action) {
		// TODO Auto-generated method stub
		try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)))) {
		    out.println(action);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	}

}
