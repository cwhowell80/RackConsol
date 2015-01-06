package Storage;
import java.util.*;
public class Warehouse {
	public List<Mod> listofMods = new ArrayList<Mod>();
	
	//Constructor to build a Warehouse of a specified number of mods, each
	//having a specified number of isles. Each Isle will have a specified 
	//number of sections all of which have the same Section Type
	public Warehouse(int mods , int isles , int numofSections, String sectionType){
		byte bCount = 65;
		String modName;
		for (int count = 0; count < mods; count++){
			char cCount = (char)bCount;
			modName = "P-1-" + cCount;
			Mod mod = new Mod(modName,isles,numofSections,sectionType);
			listofMods.add(mod);
		    bCount++;
		    									   }
						}
	//Constructor that only creates the mods and isles so that various
	// sections of different Item types can be added to each Isle
	public Warehouse(int mods , int isles){
		byte bCount = 65;
		for (int count = 0; count < mods; count++){
			char cCount = (char)bCount;
			String modName = "P-1-" + cCount;
			Mod mod = new Mod(modName,isles);
			listofMods.add(mod);
		    bCount++;
												  }
		
	}
	//Constructor that creates a Warehouse with only a specified number of mods.
	//This is done so that in the situation that each mod may need a different
	//number of Isles
	public Warehouse(int mods){
		byte bCount = 65;
		for (int count = 0; count < mods; count++){
			char cCount = (char)bCount;
			String modName = "P-1-" + cCount;
			Mod mod = new Mod(modName);
			listofMods.add(mod);
		    bCount++;
												  }
	
                              }
}
class Mod {
	//Arraylist of all the Isles in this particular Mod
	public List <Isle> listofIsles = new ArrayList<Isle>();
	private String modName;// examples P-1-A,P-1-B,P-1-C....
    private boolean restriction;//ignore this(may be deleted)
    
    //Constructor to add a mod without any Isles
    public Mod(String modName){
    	this.modName = modName;
    }
	
    //Constructor to add a mod with a specified number of Isles
	public Mod(String modName,int isles){
		int isleNumber = 200;// Starting number of an Isle in a mod
		this.modName = modName;
		 for (int count = 0; count < isles; count++){
			 Isle isle = new Isle(modName);
			 listofIsles.add(isle);
			 isleNumber++;
															}
		
	}
	//Constructor to add a Mod with a specified number of Isles all of which
	//have sections of a specific Item Type
	public Mod(String modName,int isles,int numofSections,String sectionType){
		int isleNumber = 200;// Starting number of an Isle in a mod
		this.modName = modName;
		 for (int count = 0; count < isles; count++){
			 String isleName = modName + isleNumber; 
			 Isle isle = new Isle(isleName,numofSections,sectionType);
			 listofIsles.add(isle);
			 isleNumber++;
			 
			 
															}
														}
	
	public String getModName(){
		return modName;
	}
	
}
class Isle {
	//A list containing all the sections in this particular Isle
	public List <Section> listofSections = new ArrayList<Section>();
	
	private String isleName;//examples P-1-A200,P-1-A201...P-1-B200,P-1-B201...
	
	//Constructor to create an Isle with no specified sections in it
	public Isle(String isleName){
		this.isleName = isleName;
	}
	
	//Constructor to create an Isle which has a specified number of sections
	//all of which hold a specific Item Type
	public Isle(String isleName,int numOfSections , String sectionType){
		
		int sectionNumber = 210;
		this.isleName = isleName;
		
		//Creates specified number of sections and assigns them numerical 
		//identities with gaps in the order so that additional sections of 
		//various types can be added at later times
		for (int x = 0; x < numOfSections; x++){
			int count = 0;
			for(int y = 0; y < 8; y++){
			Section section = new Section(isleName,sectionType,(sectionNumber+count));
			listofSections.add(section);
			count +=10;
			}
			sectionNumber +=100;
															   }
									 }
	
	public String getIsleName(){
		return isleName;
	}
}


	