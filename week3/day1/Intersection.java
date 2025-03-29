package week3.day1;

public class Intersection {

	public static void main(String[] args) {
		// declaring an array
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		//loop 
		for (int i = 0; i < a.length; i++) {
		//nested loop
		for (int j = 0; j < b.length; j++) {
		//compare both
			if (a[i] == b[j]) {
				System.out.println(a[i]);
			}
			}
		}

	}

}
