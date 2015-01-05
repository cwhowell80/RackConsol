package WarehouseP;
import java.util.*;
public class Warehouse {
	public List<Mod> listofMods = new ArrayList<Mod>();
	
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
	public List <Isle> listofIsles = new ArrayList<Isle>();
	private String modName;
    private boolean restriction;//ignore this(may be deleted)
    
    public Mod(String modName){
    	this.modName = modName;
    }
	
	public Mod(String modName,int isles){
		int isleNumber = 200;
		this.modName = modName;
		 for (int count = 0; count < isles; count++){
			 Isle isle = new Isle(modName);
			 listofIsles.add(isle);
			 isleNumber++;
															}
		
	}
	public Mod(String modName,int isles,int numofSections,String sectionType){
		int isleNumber = 200;
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
	public List <Section> listofSections = new ArrayList<Section>();
	private String isleName;
	
	public Isle(String isleName){
		this.isleName = isleName;
	}
	
	public Isle(String isleName,int numOfSections , String sectionType){
		//Constructor for an isle with multiple sections of same type
		int sectionNumber = 210;
		this.isleName = isleName;
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


	