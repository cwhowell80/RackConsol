package WarehouseP;
import java.util.ArrayList;
public class BinLocation {
	public static int MaxAsins;//max number of unique items allowed
	public static int NumOfItems;// total items in bin
	
	public static double Volume; // Total volume currently in bin
	public static double maxVolume;// Max Volume that can fit in bin
	
	ArrayList[] binContent = new ArrayList[NumOfItems];
	
	public void addItem(Object item){}
	
	public void removeItem(Object item){}
	
	public void listContent(){}
	
	public void setMaxAsins(int max){
		this.MaxAsins = max;
	                                }
	public void setmaxVolume(double max){
		this.maxVolume = max;
	                                    }
	public double GetmaxVolume(){
		return maxVolume;       
		                        }
	public int GetNumOfItems(){
		return NumOfItems;     
		                      }
	public double getVolume(){
		return Volume;
	                         }
	
	

}
