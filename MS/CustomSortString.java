package MS;

public class CustomSortString {
	
public static String customSortString(String S, String T) {
	
	Integer[] tCount = new Integer[26];
	for(int i = 0; i < T.length(); i++) {
		tCount[T.charAt(i)-'a']++;
	}
	
	for(int i = 0; i < S.length(); i++) {
		int count = tCount[S.charAt(i)-'a'];
		for(int k = 0; k < count; k++) {
			
		}
	}
	
	return T;
        
    }

public static void main(String[] args) {
	System.out.println(customSortString("cba","abc"));
	System.out.println(customSortString("bxyzca","abcabcabcyyzzzxxd"));
}

}
