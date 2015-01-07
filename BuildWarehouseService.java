package Storage;
import java.util.Random;
public class BuildWarehouseService {
	
	
	public static void main(String[] args){
		//Builds the warehouse with 2 mods of a single bin type
		// Single bin types are used for pallets of items
		
		Warehouse warehouse = new Warehouse(2,10,64,SectionType.SINGLE);
		
		//adds 2 mods of medium type to warehouse
		Mod mod1 = new Mod("P-1-C",10,64,SectionType.MEDIUM);
		warehouse.getListofMods().add(mod1);
		Mod mod2 = new Mod("P-1-D",10,64,SectionType.MEDIUM);
		warehouse.getListofMods().add(mod2);
		//additional modifications to be made
		
		Random random = new Random();
		int itemSig=1230001;// number used to add to the random number
        
        //Puts a random number of a unique item in every bin of the first 2 mods
        for(int a = 0;a<2;a++){//for each mods
        	
        	for(int b = 0;b<10;b++){//for each isles
        		
        		for(int c = 0;c<64;c++){//for each section
        			
        			double weight =(double)random.nextInt(49)+1;
        			double height =(double)random.nextInt(23)+1;
        			double width =(double)random.nextInt(23)+1;
        			double length =(double)random.nextInt(23)+1;
        			int numofItems = random.nextInt((int)(120000/height/width/length));
        			
        			for(int d=0;d<numofItems;d++){
        			Item item = new Item(("B00"+itemSig)
					,weight,height,width,length);
        			
        			warehouse.getListofMods().get(a).getListofIsles().
        			get(b).getListofSections().get(c).getListofBins().
        			get(0).addItem(item);
        										}
        			itemSig++;
        								}
        							}
        						}
       
        //Prints the bin contents of the first 40 bins of isle P-1-B205
        for(int e = 0;e<40;e++){
        	
        warehouse.getListofMods().get(1).getListofIsles().
		get(5).getListofSections().get(e).getListofBins().get(0).listContent();
        
	}
			}
	
			
}