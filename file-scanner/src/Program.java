import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * File file = new File("E:\\temp\\in.txt"); Scanner sc = null; try { sc = new
		 * Scanner(file); while (sc.hasNextLine()) { System.out.println(sc.nextLine());
		 * } } catch (IOException e) { System.out.print("Error: " + e.getMessage()); }
		 * finally { if (sc != null) sc.close(); }
		 */

		/*
		 * String path = "E:\\temp\\in.txt"; try (BufferedReader br = new
		 * BufferedReader(new FileReader(path))) { String line = br.readLine();
		 * 
		 * while (line != null) { System.out.println(line); line = br.readLine(); } }
		 * catch (IOException e) { System.out.println("Error " + e.getMessage()); }
		 */
		
		/*
		 * String [] lines = new String [] {"Good morning", "Good afternoon", "Good Night"};
		
		String path = "E:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\newDir").mkdir();
		System.out.println("Directory created: " + sucess);
		
		sc.close();
	}

}
