import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringReverse {
	
	public static void main(String[] args) {
		
		//Duplicate character in string
		String test = "karthik";
		
		char a[] = test.toCharArray();
		for(int i=0 ; i<test.length();i++) {
			for(int j=i+1; j<test.length(); j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate charactrs = " + a[j]);
					break;
				}
			}
		}
		
		
		//Find string is anagrams of each other
		//Eg: Army = Mary
		String a1 = "army";
		String a2 = "mary";
		boolean isAnagram = false;
		
		char a11[] = a1.toUpperCase().toCharArray();
		char a22[] = a2.toUpperCase().toCharArray();
		
		Arrays.sort(a11);
		Arrays.sort(a22);
		
		isAnagram = Arrays.equals(a11, a22);
		System.out.println("isAnagram =" + isAnagram);
		
		
		//Reverse String
		String test1 = "Hi welcome to java";
		String str = new StringBuilder(test1).reverse().toString();
		System.out.println("str =" + str);
		
		
		//Check string contains only numbers
		String numbers = "2A";
		if(numbers.matches("[0-9]+")) {
			System.out.println("Only Number");
		}else {
			System.out.println("Not only numbers");
		}
		
		
		//Find count of duplicate characters
		String names = "karthik";
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i < names.length();i++) {
			char c = names.charAt(i);
			if(map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c, ++cnt);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println("Total duplicates =" + map.toString());
		
		
	}

}
