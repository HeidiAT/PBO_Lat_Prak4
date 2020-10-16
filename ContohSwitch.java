public class ContohSwitch
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
		switch(hurufAwal)
		{
			case (char) -1 : System.out.println("Bukan huruf depan !!!"); break;
			case 'a': System.out.println("Apa namamu Amin ?"); break;
			case 'b': System.out.println("Apa namamu Bambang ?"); break;
			case 'c': System.out.println("Apa namamu Ceceo ?"); break;
			case 'd': System.out.println("Apa namamu Daud ?"); break;
			case 'e': System.out.println("Apa namamu Endang ?"); break;
			default: System.out.println("Aku tidak bisa menebak");
		}
		System.out.println();
	}
}