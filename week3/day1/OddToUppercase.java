package week3.day1;

public class OddToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		//Convert the given String to a character array
		char[] charArray = test.toCharArray();
        //Implement a loop to iterate (from end to start)
		for (int i = charArray.length -1; i >= 0; i--) {
		//Find the odd index
			if (i % 2 !=0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		//convert back to string
		String result = new String(charArray);
		System.out.println(result);
	}

}
