package aggregationAndComposition;

public class Main_N2 {
	
	public static void main(String[] args)
	{
		Laptop myLaptop = new Laptop();
		myLaptop.laptopInfo();
		
		Processor gamingProcessor = new Processor("Intel","Core i7 7200u",5,8,16,
				"50 MB","3.8 GHz");
		Graphics_card gamingGraphicsCard = new Graphics_card("Nvidia",960,"4 GB");
		Laptop gamingLaptop = new Laptop(17.2f,"16 GB",gamingProcessor,"2 TB",gamingGraphicsCard);
		gamingLaptop.laptopInfo();
	}

}
