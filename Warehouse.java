package Storage;
import java.util.*;
public class Warehouse {
	private List<Mod> listofMods = new ArrayList<Mod>();
	
	//Constructor to build a Warehouse of a specified number of mods, each
	//having a specified number of isles. Each Isle will have a specified 
	//number of sections all of which have the same Section Type
	public Warehouse(int mods , int isles , int numofSections, SectionType sectionType){
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
	public List<Mod> getListofMods(){
		return this.listofMods;
	}
}




	