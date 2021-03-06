import java.util.Scanner;

public class CeasarCipher {
	public static void main(String args[]) {
		final int move = 3;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter string to cipher: ");
		String str = in.nextLine(), encrypted = "";
		str = str.toUpperCase();
		in.close();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				encrypted += " ";
			else if ((int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) {
				int ascii = str.charAt(i) + move;
				if (ascii > 57)
					ascii = ascii - 57 + 48 - 1;
				encrypted += (char) ascii;
			} else {
				int ascii = str.charAt(i) + move;
				if (ascii > 90)
					ascii = ascii - 90 + 65 - 1;
				encrypted += (char) ascii;
			}

		}
		System.out.println(encrypted);

	}
}
