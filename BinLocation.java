package Storage;
import java.util.*;
import java.util.List;

public class BinLocation {
	public String binName;
	private int maxAsins=120001;//max number of unique items allowed
	private int numOfItems;// total items in bin
	
	private double volume; // Total volume currently in bin
	private double maxVolume;// Max Volume that can fit in bin
	
	// A List containing all the items in this specific Bin Location
	public List <Item> listofItems = new ArrayList<Item>();
	
	
	//Creates an empty bin location without any parameters assigned to it
	public BinLocation(){
		
	}
	//Assigns this Bin Location a name
	public void setName(String name){
		this.binName = name;
	}
	public void addItem(Item item){
		if(numOfItems<maxAsins){ this.listofItems.add(item);
		setNumOfItems(numOfItems+1);
		}
		else{
			System.out.println("This bin can not hold any more items");
		}
	}
	
	public void removeItem(Item item){
		this.listofItems.remove(item);
	}
	
	public void listContent(){//may need to be in a service class
		int numofItems =this.numOfItems; 
		int x =0;
		
		String[] listofItemNames = new String[numofItems];
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//adds all the Item names of each item into a string array
		for(Item item: this.listofItems){
			listofItemNames[x] = item.getItemSignature();
			x++;
			
		}
		
		//For loop to check for duplicates and keep count of the items with 
		//the same name
		for(String str:listofItemNames){//scans through each string in array
			
			//if map contains key already it adds 1 to value
			if(map.containsKey(str)){
				map.put(str, map.get(str)+1);
			                        }
			else{//adds a new key and value to map
				map.put(str,1);
			     }
			                              }
		if(map.isEmpty()){
			System.out.println("There are no items in this Bin Location");
		}
		else{
			for(Map.Entry<String,Integer> entry: map.entrySet()){
			System.out.println(entry.getValue()+" Items with the asin "+ entry.getKey());	
			}
			System.out.println("There are "+numofItems+" Items in this bin");
			System.out.println("There are "+map.size()+" Unique Items in this bin");
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
	public void setNumOfItems(int number){
		this.numOfItems = number;
	}
	
	

}
