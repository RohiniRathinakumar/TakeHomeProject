package workout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\rohik\\eclipse-workspace\\Session10\\Data\\abc.txt";
		doesFileExist(path);
	}

	public static void doesFileExist(String path) throws IOException {
		
		List<String> myList = new ArrayList<String>();
		File f = new File(path);

		if (f.exists()) {

			FileReader fr = new FileReader(f);

			BufferedReader br = new BufferedReader(fr);

			String Line = null;

			while ((Line = br.readLine()) != null) {
				myList.add(Line);
			}
			// System.out.println(myList);

			String b = myList.toString();
			String g = b.substring(1, b.length() - 1);

			String[] c = g.split("[-,]");

			for (String item : c) {

				System.out.println(item.trim());
			}
			br.close();
		} else {
			System.out.println("File does not exist");
		}
	}
}