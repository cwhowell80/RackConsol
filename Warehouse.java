package WarehouseP;
import java.util.*;
public class Warehouse {
	public List<Mod> listofMods = new ArrayList<Mod>();
	
	public Warehouse(int mods , int isles , int columns, int rows){
		byte bCount = 65;
		for (int count = 0; count < mods; count++){
			Mod mod = new Mod(isles,columns,rows);
			listofMods.add(mod);
		    char cCount = (char)bCount;
		    mod.setModName(cCount);
		    bCount++;
		    
														}
						}
}
class Mod {
	public List <Isle> listofIsles = new ArrayList<Isle>();
	private String modName;
	public Mod(int isles,int columns , int rows){
		int isleNumber = 200;
		 for (int count = 0; count < isles; count++){
			 Isle isle = new Isle(columns,rows);
			 listofIsles.add(isle);
			 isle.setIsleNumber(isleNumber);
			 isleNumber++;
															}
														}
	public void setModName(char name){
		this.modName ="P-1-"+ name;
	}
	public String getModName(){
		return modName;
	}
	
}
class Isle {
	public List <Column> listofBins = new ArrayList<Column>();
	private int isleName;
	
	public Isle(int columns , int rows){
		for (int count = 0; count < columns; count++){
			Column column = new Column(rows);
			listofBins.add(column);
															   }
									 }
	public void setIsleNumber(int number){
		this.isleName = number;
	}
	public int getIsleName(){
		return isleName;
	}
}
class Column {
	private String columnName;
	List <Row> rowLocation = new ArrayList<Row>();
	public Column(int rows){
		
	}
	public void setColumnName(String name){
		this.columnName = name;
	}
	public String getColumnName(){
		return columnName;
	}
}
class Row{
	private String RowName;
	List <BinLocation> binLocation = new ArrayList<BinLocation>();
	
}