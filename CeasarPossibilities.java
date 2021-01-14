import java.util.Scanner;

public class CeasarPossibilities {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter text to get all possible decryptions \n");
		String str = in.nextLine().toUpperCase();
		in.close();
		String finalValue = "";
		String temp = "";
		int val = 0;
		int strLength = str.length();
		for (int i = 1; i < 27; i++) {
			for (int j = 0; j < strLength; j++) {
				if (str.charAt(j) == ' ')
					temp += ' ';
				else {
					val = str.charAt(j) + i;
					if (val > 90) {
						val = val - 90 + 65 - 1;
					}
				}

				temp += (char) val;
				val = 0;
			}
			finalValue += temp + "\n";
			temp = "";
		}
		System.out.println("All possibile solutions: ");
		System.out.println(finalValue);
	}

}
