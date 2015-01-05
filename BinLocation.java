package WarehouseP;
import java.util.ArrayList;
import java.util.List;

public class BinLocation {
	public String binName;
	private int maxAsins;//max number of unique items allowed
	private int numOfItems;// total items in bin
	
	private double volume; // Total volume currently in bin
	private double maxVolume;// Max Volume that can fit in bin
	
	public List <Item> listofBins = new ArrayList<Item>();
	public BinLocation(){
		
	}
	public void setName(String name){
		this.binName = name;
	}
	public void addItem(Object item){}
	
	public void removeItem(Object item){}
	
	public void listContent(){}
	
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
