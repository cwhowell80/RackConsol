package Storage;

import java.util.ArrayList;
import java.util.List;

public class Isle {
	//A list containing all the sections in this particular Isle
	private List <Section> listofSections = new ArrayList<Section>();
	
	private String isleName;//examples P-1-A200,P-1-A201...P-1-B200,P-1-B201...
	
	//Constructor to create an Isle with no specified sections in it
	public Isle(String isleName){
		this.isleName = isleName;
	}
	
	//Constructor to create an Isle which has a specified number of sections
	//all of which hold a specific Item Type
	public Isle(String isleName,int numOfSections , SectionType sectionType){
		
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
			sectionNumber +=100;// to create a gap so bins can be added later
															   }
									 }
	
	public String getIsleName(){
		return isleName;
	}
	public List<Section> getListofSections(){
		return this.listofSections;
	}
}


