package Storage;

public class Item {
	private double weight;  // Dimensions in pounds
	private double height;  // Dimensions in inches      
	private double width;   // Dimensions in inches
	private double length;  // Dimensions in inches
	private String itemSignature;// The UPC associated with the item
	
	//both need to be enum classes
	private String weightType; // Light , Heavy, TeamLift, or MechLift
	private String itemType; // Small, Medium, Large,Vertical,Rainbow, or Ladder
	
	
	public Item(String itemSignature,double weight,double height,double width, double length)
	{
		this.weight = weight;
		this.height = height;
		this.length = length;
		this.width = width;
		this.itemSignature = itemSignature;
		setWeightType(weight);
		setItemType( height,width, length);
		
	}
	public void setWeightType(double weight)
	{
		String weightType = "";
		if(weight < 30) weightType = "Light";
		if(weight >=30 && weight < 50) weightType = "Heavy";
		if(weight >=50 && weight < 100) weightType = "Team Lift";
		if(weight >= 100) weightType = "Mech Lift";
		//else() throw weightException;
		this.weightType = weightType;
	}
	public void setItemType(double height, double width, double length)
	{
		String itemType;
		Double longest, longer , shortest;
		
		// Code to sort Longest to Shortest dimensions
		if ( height >= width&& height >= length ){
			 longest = height;
			 if (width > length)   {
               longer = width;
               shortest = length; }
			 else               {
				 longer = length;
				 shortest = width; }
			                                     }
		 else if ( width >= height&& width >= length ){
			 longest = width;
			 if (height> length)   {
               longer = height;
               shortest = length; }
			 else               {
				 longer = length;
				 shortest = height; }
			                                          }
		 else                                   {
			 longest = length;
			 if (height> width)   {
               longer = height;
               shortest = width; }
			 else               {
				 longer = width;
				 shortest = height; }
			                                    }
		//Code to determine ItemType
		if(longest<18 && longer<8 &&shortest<7) itemType = "Small";
		else if(longest<24) itemType = "Meduim";
		else if(longest <48 && longer <24) itemType = "Large";
		else if(longest <72 && longer <24) itemType = "Vertical";
		else if(longest >72 && longer <24) itemType = "Ladder";
		else itemType = "RainBow";
		this.itemType = itemType;
	}
	public String getItemType(){
		return this.itemType;
	}
	public String getWeightType(){
		return this.weightType;
	}
	public String getItemSignature(){
		return this.itemSignature;
	}
	public double getWeight(){
		return this.weight;
	}
	public double getHeight(){
		return this.height;
	}
	public double getLength(){
		return this.height;
	}
	public double getWidth(){
		return this.width;
	}
}
