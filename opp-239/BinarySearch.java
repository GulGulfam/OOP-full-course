import java.util.Scanner;
import java.util.Arrays;
class  BinarySearch{

public static int binarySearch(int[] array, int target ){

		int low = 0, high = (array.length)-1,mid;

		while(low<=high){
			mid = (low+high)/2;

			if(target==array[mid]){
				return mid;

			}

			else if(target<array[mid]){
				high = --mid;

			}
			else{
				low = ++mid;
			}
			

		}

		return -1;
	}








	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] array = {1,2,44,55,70};

		System.out.println(Arrays.toString(array));

		System.out.println("enter target value  ");
		int target  = sc.nextInt();


		int value = binarySearch(array,target);

		System.out.println(value);



	
	}
	
}