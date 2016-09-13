
import java.util.Scanner;
import java.io.IOException;
import java.awt.*;       // Using AWT containers and components
import java.awt.event.*; // Using AWT events and listener interfaces
import javax.swing.*;    // Using Swing components and containers
public class RackData {

	public static void main(String[] args) throws IOException {
		
		Scanner User_input = new Scanner(System.in);
		System.out.println("Enter the file name and location you want to input");
		// "C:/Users/Chris/My Documents/RackTest.txt "
		String file_name = User_input.nextLine();
		
		double height = 0;
		double length = 0;
		double width = 0;
		double Num_of_Items = 0;
		double Volume = 0;
		double weight = 100;
		double maxV = 40000;
		SwingUtilities.invokeLater(new Runnable() {
	         @Override
	         public void run() {
	            new RackDisplay(); // Let the constructor do the job
	         }
		});
		try {
			RackInput file = new RackInput(file_name);
			String[] aryLines = file.OpenFile();
			String[] BrokenLine;
			for (int i = 0; i<aryLines.length-1; i++){
				
				BrokenLine = aryLines[i].split(" ");
				
				for (int x = 0; x <11; x++){
				 
					System.out.println(x+ " " + BrokenLine[x]);
					
					if(BrokenLine[x].equals("Height")){
					String S_Height = BrokenLine[x+1].trim();
					height = Double.parseDouble(S_Height);
				    }
				 
					if(BrokenLine[x].equals("Length")){
						String S_Length = BrokenLine[x+1].trim(); 
						length = Double.parseDouble(S_Length);
					 }
				 
					if(BrokenLine[x].equals("Width")){
						String S_Width = BrokenLine[x+1].trim();
						width = Double.parseDouble(S_Width);
					 }
				   
					 if(BrokenLine[x].equals("Weight")){
						String S_Weight = BrokenLine[x+1].trim();
						weight = Double.parseDouble(S_Weight);
					 }
				 
					 if(BrokenLine[x].equals("Number_Of_Items")){
						String S_Number_Of_Items = BrokenLine[x+1].trim();
						Num_of_Items = Double.parseDouble(S_Number_Of_Items);
				      }
						
				Volume = height*length*width*Num_of_Items;
				}
				 System.out.println(aryLines[i]);
				 System.out.println("Height is " +height+ " the value of length is "+ length);
				 System.out.println("Width is " +width+ " the Number of Items is "+ Num_of_Items);
				 System.out.println(i+" The volume of items at bin "+ BrokenLine[0]+ " is " + Volume);
				if(Volume < maxV){
					System.out.println("Add bin location " + BrokenLine[0]+ " to pick path");
				}
				else{
					System.out.println("Do Not add bin location " + BrokenLine[0]+ " to pick path");
				}
				  
			}
		}
		
		catch (IOException e){
			System.out.println(e.getMessage());
		}
	}

}
