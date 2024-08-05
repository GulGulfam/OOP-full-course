import java.util.Arrays;
class ArraySwap {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		int[] t = arr;
	
			int temp = t[0];
			t[0] = arr[(arr.length)-1];
			arr[(arr.length)-1] = temp;
			
		
		System.out.println(Arrays.toString(temp));
	}
	
}