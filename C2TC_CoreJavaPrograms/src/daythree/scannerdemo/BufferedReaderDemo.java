package daythree.scannerdemo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//IO Exception -> if the file is not present 
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader -> wraps or holds the data/input
		System.out.println("Enter the name:");
		String name = buffer.readLine();
		System.out.println("Enter the age:");
		int age = Integer.parseInt(buffer.readLine());
		System.out.println(name +" "+ age);
		
		

	}

}
