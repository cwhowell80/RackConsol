
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class RackInput {
	private String path;
	
	public RackInput (String file_path){
		path = file_path;
	}
	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		int NumberOfLines = readLines();
		String[] textData = new String[NumberOfLines];
		
		int i;
			for(i=0; i<NumberOfLines; i++){
				textData[i] = textReader.readLine();
			}
		textReader.close();
		return textData;
	}
	public int readLines() throws IOException {
		
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int NumberOfLines = 0;
		while ((aLine = bf.readLine()) != null){
			NumberOfLines++;
		}
		bf.close();
		return NumberOfLines;
		}
		
	
	

}
