package decorator_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	public static void main(String[] args) throws IOException {
		
		int c;
		// Decorating the InputStream in variable with FileInputStream class,
		// BufferredInputStream and 
		// LowerCaseInputStream classes
		try {
			InputStream in = 
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("text.txt")));
			// read in until no more char left
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
