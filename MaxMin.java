import java.util.Scanner;

public class MaxMin
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int max, min, j, z, n;
		
		System.out.print("Masukkan jumlah bilangan: ");
			j = input.nextInt();
		min = j;
		max = j;
		for (z=1; z<=j; z++)
		{
			System.out.print("Masukkan bilangan ke-" + z + ": ");
				n = input.nextInt();
			
			if (n< min)
			{
				min = n;
			}
			else if (n > max)
			{
				max = n;
			}
			else 
			{
			}
		}
		System.out.println("Nilai Min: " +min);
		System.out.println("Nilai Max: " +max);
	}
}