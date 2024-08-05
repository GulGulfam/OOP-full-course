import java.util.Scanner;
class ArrayIdentityMatrix {
	static boolean isIdentity(int matrix[][], int num)
	{
		for (int row = 0; row < num; row++)
		{
			for (int col = 0; col < num; col++)
			{
				if (row == col && matrix[row][col] != 1)
					return false;
				else if (row != col && matrix[row][col] != 0)
					return false;
			}
		}
		return true;
	}

	


		Scanner sc = new Scanner(System.in);

	// Driver Code
	public static void main(String args[])
	{
		int num = 4;
		int matrix[][] = {{1, 0, 0, 0},
					{0, 1, 0, 0},
					{0, 0, 1, 0},
					{0, 0, 0, 1}};
		boolean value = isIdentity(matrix, num);
		if (value)
		System.out.println("Matrix ");
		else
		System.out.println("Not a matrix ");
	}
}

