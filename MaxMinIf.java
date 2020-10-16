import java.util.Scanner;

public class MaxMinIf
{
public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int max, min, a,b,c,d,e;
		
		System.out.print("Masukkan Nilai 1: ");
			a = input.nextInt();
		System.out.print("Masukkan Nilai 2: ");
			b = input.nextInt();
		System.out.print("Masukkan Nilai 3: ");
			c = input.nextInt();
		System.out.print("Masukkan Nilai 4: ");
			d = input.nextInt();
		System.out.print("Masukkan Nilai 5: ");
			e = input.nextInt();
		System.out.println();
		
		if (a>b && a>c && a>d && a>e)
		{
			max = a;
		}
		else if (b>a && b>c && b>d && b>e)
		{
			max = b;
		}
		else if (c>a && c>b && c>d && c>e)
		{
			max = c;
		}
		else if (d>a && d>b && d>c && d>e)
		{
			max = d;
		}
		else 
			max = e;
		
		
		if (a<b && a<c && a<d && a<e)
		{
			min = a;
		}
		else if (b<a && b<c && b<d && b<e)
		{
			min = b;
		}
		else if (c<a && c<b && c<d && c<e)
		{
			min = c;
		}
		else if (d<a && d<b && d<c && d<e)
		{
			min = d;
		}
		else 
			min = e;
		
		System.out.println("Nilai Min: " +min);
		System.out.println("Nilai Max: " +max);
	}
}