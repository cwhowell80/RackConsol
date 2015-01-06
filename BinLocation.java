package Storage;
import java.util.*;
import java.util.List;

public class BinLocation {
	public String binName;
	private int maxAsins;//max number of unique items allowed
	private int numOfItems;// total items in bin
	
	private double volume; // Total volume currently in bin
	private double maxVolume;// Max Volume that can fit in bin
	
	// A List containing all the items in this specific Bin Location
	public List <Item> listofItems = new ArrayList<Item>();
	
	
	//Creates an empty binlocaion wihout any parameters assigned to it
	public BinLocation(){
		
	}
	//Assigns this Bin Location a name
	public void setName(String name){
		this.binName = name;
	}
	public void addItem(Item item){
		this.listofItems.add(item);
	}
	
	public void removeItem(Item item){
		this.listofItems.remove(item);
	}
	
	public void listContent(){// unfinished and non functional
		int numofItems =this.numOfItems; 
	
		for(int x = 0;x<numofItems;x++){
			for (int y = 1;y<numofItems;y++)
				if(listofItems.get(x).getItemSignature().equals
						(listofItems.get(y).getItemSignature())){
					
					
				}
					
			//String asin = item.getItemSignature();
			//System.out.println(asin);
		}
	}
	
	public void setMaxAsins(int max){
		maxAsins = max;
	                                }
	public void setmaxVolume(double max){
		maxVolume = max;
	                                    }
	public double getmaxVolume(){
		return maxVolume;       
		                        }
	public int getNumOfItems(){
		return numOfItems;     
		                      }
	public double getVolume(){
		return volume;
	                         }
	
	

}
