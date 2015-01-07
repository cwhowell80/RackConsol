package Storage;

import java.util.ArrayList;
import java.util.List;

//Each individual Mod instance may be subject to individual analysis for consolidation
//Each individual Mod instance may be used for analysis to give info on available space
public class Mod {
	//Arraylist of all the Isles in this particular Mod
		private List <Isle> listofIsles = new ArrayList<Isle>();
		private String modName;// examples P-1-A,P-1-B,P-1-C....
	   
	    //Constructor to add a mod without any Isles
	    public Mod(String modName){
	    	this.modName = modName;
	    }
		
	    //Constructor to add a mod with a specified number of Isles
		public Mod(String modName,int isles){
			int isleNumber = 200;// Starting number of an Isle in a mod
			this.modName = modName;
			for (int count = 0; count < isles; count++){
				 String isleName = modName + isleNumber; 
				 Isle isle = new Isle(isleName);
				 listofIsles.add(isle);
				 isleNumber++;
																}
			
		}
		//Constructor to add a Mod with a specified number of Isles all of which
		//have sections of a specific Item Type
		public Mod(String modName,int isles,int numofSections,SectionType sectionType){
			int isleNumber = 200;// Starting number of an Isle in a mod
			this.modName = modName;
			
			for (int count = 0; count < isles; count++){
				//adds isle suffix to the modName, creates and adds isle to mod
				 String isleName = modName + isleNumber; 
				 Isle isle = new Isle(isleName,numofSections,sectionType);
				 listofIsles.add(isle);
				 isleNumber++;
				 
				 
																}
															}
		
		public String getModName(){
			return modName;
		}
		public List<Isle> getListofIsles(){
			return this.listofIsles;
		}
		
	}


