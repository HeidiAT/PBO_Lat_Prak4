import java.util.Scanner;

public class program4if
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int nilai;
		
		System.out.print("Masukkan nilai= ");
			nilai = input.nextInt();
		
		if (nilai == 1)
		{
			System.out.println("Angka yang dimasukkan satu");
		}
		else
			System.out.println("Angka yang dimasukkan bukan satu");
	}
}