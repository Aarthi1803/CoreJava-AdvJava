package hello;

public class JUnitDemo {

	public static void main(String[] args) {
		String original = "Java";
		String reversed = reverseString(original);
		System.out.println("Original: "+ original);
		System.out.println("Reversed: "+ reversed);
	}

	// Java ==> avaJ; Alien ==> neilA
	private static String reverseString(String str) {
		char charArray[] = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;
		while(left < right) {
			// Swap characters at the left and right positions
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			//Move the pointers towards each other
			left++;
			right--;
		}
		return new String(charArray);
	}

}
