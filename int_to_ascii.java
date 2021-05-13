import java.util.Scanner;

public class int_to_ascii {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ints, seperated by spaces: \n");
		String str = s.nextLine();
		s.close();
		String[] splited = str.split("\\s+");
		String output = "";
		for (int i = 0; i < splited.length; i++) {
			int val = Integer.parseInt(splited[i]);
			char ch = (char) val;
			output += ch;
		}
		System.out.println(output);
		
	}
}
