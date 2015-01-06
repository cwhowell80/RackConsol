package Storage;

public class BuildWarehouseService {
	
	
	public static void main(String[] args){
		Warehouse warehouse = new Warehouse(6,50,64,"Small");
		String x;
		int w = 1;
        for(int y = 0;y<64;y++){
			
			System.out.println("section "+ w);
			w++;
			
			for (int z=0;z<42;z++){
		 x = warehouse.listofMods.get(1).listofIsles.get(24).listofSections.get(y).listofbins.get(z).binName;
		 System.out.println(x);
			}
			
	}

}
}