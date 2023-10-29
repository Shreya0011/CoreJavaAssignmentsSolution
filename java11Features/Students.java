package java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var path = "D:\\StudentList.txt";
		int count = 0;
		try {
			List<String> allLine = Files.readAllLines(Path.of(path));
			for(String line: allLine) {
				if(!line.isBlank()) {
					System.out.println(line);
					count++;
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(count);
	}

}
