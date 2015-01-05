package WarehouseP;

import java.util.ArrayList;
import java.util.List;

class Section {
	/*A Section is the smallest grouping of bins in that you would never
	 * create a section that is composed of more than one type of item */
	 
	public List <BinLocation> listofbins = new ArrayList<BinLocation>();
	
	public Section(String sectionType, int columnNumber){
		if(sectionType.equals("Small")) createSmallSection(columnNumber);
		else if(sectionType.equals("Medium")) createMediumSection(columnNumber);
		else if(sectionType.equals("Large")) createLargeSection(columnNumber);
		else if(sectionType.equals("Batbin")) createBatBinSection(columnNumber);
		else if(sectionType.equals("SingleBin")) addSingleBin(columnNumber); 
			
												  
		//else throw InvalidInputException
	}		
	public void addSingleBin(int columnNumber)	{
		BinLocation binlocation = new BinLocation();
		listofbins.add(binlocation);
		binlocation.setName("A"+ columnNumber);
		}//visibility issue
	
	private void createSmallSection(int columnNumber){
		int column = 0;
		char row;
		byte bCount = 65;
		for(int x = 0;x<7;x++){
			row = (char)bCount;
			bCount++;
			for(int y=0; y<6; y++){
				BinLocation binlocation = new BinLocation();
				listofbins.add(binlocation);
				binlocation.setName( row+" "+column);
				column++;
									}
								}
	}
	private void createMediumSection(int columnNumber){
		BinLocation binlocation1 = new BinLocation();
		listofbins.add(binlocation1);
		binlocation1.setName("A"+columnNumber);
		BinLocation binlocation2 = new BinLocation();
		listofbins.add(binlocation2);
		binlocation2.setName("A"+(columnNumber+5));
		BinLocation binlocation3 = new BinLocation();
		listofbins.add(binlocation3);
		binlocation3.setName("B"+columnNumber);
		BinLocation binlocation4 = new BinLocation();
		listofbins.add(binlocation4);
		binlocation4.setName("C"+columnNumber);
		BinLocation binlocation5 = new BinLocation();
		listofbins.add(binlocation5);
		binlocation5.setName("D"+columnNumber);
		BinLocation binlocation6 = new BinLocation();
		listofbins.add(binlocation6);
		binlocation6.setName("D"+(columnNumber+5));
	}
	private void createLargeSection(int columnNumber){
		BinLocation binlocation1 = new BinLocation();
		listofbins.add(binlocation1);
		binlocation1.setName("A"+columnNumber);
		BinLocation binlocation2 = new BinLocation();
		listofbins.add(binlocation2);
		binlocation2.setName("C"+columnNumber);
	}
	private void createBatBinSection(int columnNumber){
		
		char row;
		byte bCount = 65;
		for(int x = 0;x<7;x++){
			int column = 0;
			row = (char)bCount;
			bCount++;
			for(int y=0; y<2; y++){
				BinLocation binlocation = new BinLocation();
				listofbins.add(binlocation);
				binlocation.setName( row+" "+(column+columnNumber));
				column+= 5;
			}
		}
	}
}