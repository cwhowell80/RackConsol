package WarehouseP;

import java.util.*;


class Section {
	/*A Section is the smallest grouping of bins in that you would never
	 * create a section that is composed of more than one type of item */
	 
	public List <BinLocation> listofbins = new ArrayList<BinLocation>();
	
	public Section(String isleName,String sectionType, int sectionNumber){
		if(sectionType.equals("Small")) createSmallSection(sectionNumber,isleName);
		else if(sectionType.equals("Medium")) createMediumSection(sectionNumber,isleName);
		else if(sectionType.equals("Large")) createLargeSection(sectionNumber,isleName);
		else if(sectionType.equals("Batbin")) createBatBinSection(sectionNumber,isleName);
		else if(sectionType.equals("SingleBin")) addSingleBin(sectionNumber,isleName); 
			
												  
		//else throw InvalidInputException
	}		
	public void addSingleBin(int sectionNumber, String isleName)	{
		BinLocation binlocation = new BinLocation();
		listofbins.add(binlocation);
		binlocation.setName(isleName+"A"+ (sectionNumber));
		}//visibility issue
	
	private void createSmallSection(int sectionNumber, String isleName ){
		
		char row;
		byte bCount = 65;
		for(int x = 0;x<7;x++){
			int column = 0;
			row = (char)bCount;
			bCount++;
			for(int y=0; y<6; y++){
				BinLocation binlocation = new BinLocation();
				listofbins.add(binlocation);
				binlocation.setName(isleName+row+(sectionNumber+column));
				column++;
									}
								}
	}
	private void createMediumSection(int columnNumber, String isleName){
		BinLocation binlocation1 = new BinLocation();
		listofbins.add(binlocation1);
		binlocation1.setName(isleName+"A"+columnNumber);
		BinLocation binlocation2 = new BinLocation();
		listofbins.add(binlocation2);
		binlocation2.setName(isleName+"A"+(columnNumber+5));
		BinLocation binlocation3 = new BinLocation();
		listofbins.add(binlocation3);
		binlocation3.setName(isleName+"B"+columnNumber);
		BinLocation binlocation4 = new BinLocation();
		listofbins.add(binlocation4);
		binlocation4.setName(isleName+"C"+columnNumber);
		BinLocation binlocation5 = new BinLocation();
		listofbins.add(binlocation5);
		binlocation5.setName(isleName+"D"+columnNumber);
		BinLocation binlocation6 = new BinLocation();
		listofbins.add(binlocation6);
		binlocation6.setName(isleName+"D"+(columnNumber+5));
	}
	private void createLargeSection(int columnNumber, String isleName){
		BinLocation binlocation1 = new BinLocation();
		listofbins.add(binlocation1);
		binlocation1.setName("A"+columnNumber);
		BinLocation binlocation2 = new BinLocation();
		listofbins.add(binlocation2);
		binlocation2.setName("C"+columnNumber);
	}
	private void createBatBinSection(int columnNumber, String isleName){
		
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