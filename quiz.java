import java.util.scanner;
public class quiz {

     public static void main (String [] args) {
     	Scanner in = new Scanner (System.in);
     	String nama, tp,jp,status, JKT,MKS,bisnis,ekonomi;
     	int noktp, bayar, harga, tbayar, biaya, kembalian,discount;
     	double Y,T;
     	
     	System.out.println ("Masukkan Nama : ");
     	nama=in.nextLine();
     	System.out.println ("Masukkan No KTP : ");
     	noktp=input.nextInt();
     	System.out.println ("Masukkan status member : ");
     	status=in.nextLine();
     	System.out.println ("Masukkan tujuan penerbangan : ");
     	tp=in.nextLine();
     	System.out.println ("Masukkan jenis penerbangan : ");
     	jp=in.nextLine();
     	System.out.println ("Masukkan jumlah yang anda bayar : ");
     	bayar=in.nextLine();
     	System.out.println ();
     	
     	if(jp = Ekonomi && tp  =JKT-MKS)
		{
			biaya = 1000000;
		}
		else if(jp = Ekonomi && tp=MKS-JKT)
		{
			biaya = 1500000;
		}
		else if(jp = Bisnis && tp=JKT-MKS)
		{
			biaya = 2500000;
		}
		else if(jp =Bisnis && tp=MKS-JKT)
		{
			biaya = 3000000;
		}
		
		
	/*	switch (status)
		{
		
		if (status= Y); 
		}
			discount= biaya*0.1
		{
		else if (status= T);
		}
			discount= biaya*0.1;
		} */
		
		tbayar = biaya* (biaya*discount);
		kembalian = biaya - tbayar ;
		
		System.out.println ("Nama Anda : "+nama);
		System.out.println ("NO KTP anda : " +noktp);
		System.out.println ("Total Bayar Anda :Rp  "+bayar);
		System.out.println ( "bayar : ");
		System.out.println ("kembalian : Rp "+kembalian);
		
		
		
     }

   }