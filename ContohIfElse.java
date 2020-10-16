import java.io.*;

public class ContohIfElse
{
	public static void main(String[] args)
	{
		char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama anda: ");
		
		try
		{
			hurufAwal = (char)System.in.read();
		}
		catch(Exception e)
		{
			System.out.println("Salah ko menginput cess...!");
		}
		System.out.println();
		if (hurufAwal == 'a')
			System.out.println("Apa namamu Amin ?");
		else if (hurufAwal == 'b')
			System.out.println("Apa namamu Bambang ?");
		else if (hurufAwal == 'c')
			System.out.println("Apa namamu Ceceo ?");
		else if (hurufAwal == 'd')
			System.out.println("Apa namamu Daud ?");
		else if (hurufAwal == 'e')
			System.out.println("Apa namamu Endang ?");
		else
			System.out.println("Aku tidak bisa menebak");
		System.out.println();
	}
}