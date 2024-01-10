package newTest;

public class ReverseArray {
	int[] reverseArray(int[] arr) {
		int[] b = new int[arr.length];
		int j=0;
		for (int i = arr.length-1; i>=0; i--, j++) {
			b[j]=arr[i];
    	}
		return b;
	}
}
