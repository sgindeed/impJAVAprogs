import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExArrayPrimeNumberMatrix
{
	// Function to check a number is prime or not
	boolean isPrime(int n) 
	{
		int c = 0;
		for(int i = 1; i<=n; i++)
		{
			if(n%i == 0)
				c++;
		}
		if(c == 2)
			return true;
		else
			return false;
	}

	public static void main(String args[])throws IOException
	{
		// create object of Prime number matrix.
		ExArrayPrimeNumberMatrix ob = new ExArrayPrimeNumberMatrix();

		// create object of buffer stream.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		// enter the number of rows and column.
		System.out.print("Enter the number of rows : ");
		int m=Integer.parseInt(br.readLine());

		System.out.print("Enter the number of columns : ");
		int n=Integer.parseInt(br.readLine());

		// 2D array for storing 'm*n' prime numbers
		int A[][]=new int[m][n];

		// 1D array for storing 'm*n' prime numbers
		int B[] = new int [m*n];

		// For taking natural numbers
		int i = 0, j;
		int k = 1; 

		// for iD Array.
		while(i < m*n)
		{
			if(ob.isPrime(k)==true)
			{
				B[i] = k;
				i++;
			}
			k++;
		}

		// for 2D Array.
		int x = 0;
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				A[i][j] = B[x];
				x++;
			}
		}

		// printing the result in 2D Array.
		System.out.println("The Final Array is : ");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
