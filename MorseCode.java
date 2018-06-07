import java.util.HashMap;
import java.util.HashSet;

public class MorseCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.",
				"--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
				".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
				"-..-", "-.--", "--.." };
		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' };
		int i = 0;
		HashMap<Character, String> morseCodeMap = new HashMap<Character, String>();
		for (String morseCode : morseCodes) {
			morseCodeMap.put(alphabets[i], morseCode);
			i++;
		}

		String[] words = { "gin", "zen", "gig", "msg" };
		HashSet<String> unique = new HashSet<String>();
		for (String word : words) {
			StringBuilder build = new StringBuilder();
			for (int j = 0; j < word.length(); j++) {
				build.append(morseCodeMap.get(word.charAt(j)));
				System.out.println(word.charAt(j) + " char morse code is "
						+ morseCodeMap.get(word.charAt(j)));
			}
			System.out
					.println(word + " word morse code is " + build.toString());
			unique.add(build.toString());
		}

		System.out.println("Unique morse codes are " + unique.size());
	}
}
