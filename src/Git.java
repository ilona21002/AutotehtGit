
public class Git {

	public static void main(String[] args) {
		
        
		Auto auto1 = new Auto();
		
		auto1.merkki = "Citroen";
		auto1.malli = "C4";
		auto1.bensanMaara = 15;
		auto1.tankkaus = 5;
		auto1.jarruta();
		
		auto1.naytaTiedot();
		
		Auto auto2 =new Auto();
		
		auto2.merkki ="BMW";
		auto2.malli = "S5";
		auto2.bensanMaara = 5;
		auto2.tankkaus = 20;
		auto2.kiihdyta();
		
		auto2.naytaTiedot();

	}

} // Mainin lopetus

class Auto
{
	public String merkki;
	public String malli;
	public int bensanMaara;
	public int tankkaus;
	
	public void jarruta ()
	{
		System.out.println("Auto jarruttaa");
	}

	public void kiihdyta ()
	{
		System.out.println("Auto kiihtyy");
		
		bensanMaara = bensanMaara -1;
		
		if (bensanMaara<0);	
	
	}
	
	public void tankkaa()
	{
		
	}
	
	 public void naytaTiedot ()
	 {
		 System.out.println("Merkki: " + merkki);
		 System.out.println("Malli: " + malli);
		 System.out.println("Tankissa bensaa: " + bensanMaara);
		 System.out.println("Tankkaus: " + tankkaus);
		 System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (bensanMaara + tankkaus));
		 
	 }
	
	
}

