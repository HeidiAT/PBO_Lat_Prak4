import java.util.Scanner;

public class PositifNegatif
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a, p, n;
		
		System.out.print("Masukkan nilai: ");
			a = input.nextInt();
		
		if (a < 0)
		{
			System.out.println("Bilangan Negatif");
		}
		if (a > 0)
		{
			System.out.println("Bilangan Positif");
		}
	}
}