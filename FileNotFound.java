package exception;

import java.io.*;

public class FileNotFound {

	public static void main(String[] args) {
		try {
		FileOutputStream obj=new FileOutputStream("F:\\java_wccm9\\Test.text");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
