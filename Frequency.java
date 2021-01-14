import java.util.*;

public class Frequency {
	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter text to count frequencies: \n");
		String str = s.nextLine();
		int counter = 0;
		while (counter < str.length()) {
			char c = str.charAt(counter);
			if (map.get(c) == null)
				map.put(c, 1);
			else
				map.put(c, map.get(c) + 1);
			counter++;
		}
		s.close();
		System.out.println(map);
		System.out.println(str);
	}
}
