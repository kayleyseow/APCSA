import java.util.*;
import java.awt.List;
import java.io.IOException;
public class Maps {
	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner (System.in);
		long numberofelements = console.nextLong();
		long numberofforgottenwords = console.nextLong();
		long numberoffavoritewords = console.nextLong();
		//System.out.println(numberofelements + " " + numberofforgottenwords + " " + numberoffavoritewords);
		Map <String, Long> map = new HashMap <String, Long>();
		for (long i = 0; i < numberofelements; i++) {
			String word = console.next();
			long frequency = console.nextLong();
			//System.out.println(word + " " + frequency);
			map.put(word,frequency);
		}
		for (long i = 0; i < numberofforgottenwords; i++) {
			String word = console.next();
			long frequency = console.nextLong();
			//System.out.println(word + " " + frequency);
			map.put(word, (Long) map.getOrDefault(word, 0L)+frequency);
		}
		long sum = 0;
		for (long i = 0; i < numberoffavoritewords; i++) {
			String favoriteword = console.next();
			//System.out.println(word + " " + frequency);
			sum += map.getOrDefault(favoriteword, 0L);
			sum%= 1000000007;
		}
		System.out.println((Long)sum);
	}
}