import java.util.Scanner ;
public class Program
{
public static void main(String args [])
{
Scanner Scan=new Scanner (System.in);

System.out.println("  	Daftar Menu Kantin ");
System.out.println("============================================");
System.out.println("1.Nasi Goreng			= Rp.7000");
System.out.println("2.Nasi Goreng+telur		= Rp.10000");
System.out.println("3.Mie Ayam			= Rp.13000");
System.out.println("4.Bakso Urat			= Rp.17000");
System.out.println("5.Ayam geprek+nasi		= Rp.20000");
System.out.println("6.Sate				= Rp.13000");
System.out.println("");
int harga = 0;
int h1 =12000, h2=15000, h3=13000, h4=17000, h5=20000, h6=13000;
String menu ;
for (String x= "Y";x.equals("Y")||x.equals("y");)
{
	System.out.println("__________________________________________________");
	System.out.println("Masukan nomor menu pilihan anda : ");
	int inNomor = Scan.nextInt();
	System.out.println("__________________________________________________");
	
	if(inNomor == 1) {
		menu = "Nasi Goreng";
		System.out.println("Pilihan anda nomor " + inNomor +"."+ menu);
		harga= harga + h1;
		
	}
	else if (inNomor == 2) {
		menu = "Nasi Goreng+Telur";
		System.out.println("Pilihan anda nomor " + inNomor +"."+ menu);
		harga= harga + h2;
		
	}
	else if (inNomor == 3) {
		menu = "MIe ayam";
		System.out.println("Pilihan anda nomor " + inNomor +"."+ menu);
		harga= harga + h3;
		
		
	}
	else if (inNomor == 4) {
		menu = "Bakso Urat";
		System.out.println("Pilihan anda nomor " + inNomor +"."+ menu);
		harga= harga + h4;
		
	}
	else if (inNomor == 5) {
		menu = "Ayam geprek+nasi";
		System.out.println("Pilihan anda nomor " + inNomor +"."+ menu);
		harga= harga + h5;
		
		
	}
	else if (inNomor == 6) {
		menu = "Sate";
		System.out.println("Pilihan anda nomor " + inNomor +"."+ menu);
		harga= harga + h6;
	} 
	else
	{
		System.out.println("Nomor yang dipilih tidak ada di menu");
	}
	System.out.println("Apakah anda ingin memesan lagi? Y/T");
	x = Scan.next();
}
System.out.println("________________________________________");
System.out.println("Total pembayaran sebesar " +harga+".");
System.out.println("Terima Kasih atas Kunjungannya. ");
}
}


		
		
		