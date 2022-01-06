package tecval;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SeekAndDeleteChar {

	private static Scanner scannedFile;


	public static void main(String[] args) throws IOException{
		
		if(args.length == 2) {
			
			String filePathIn = args[0];
			String fileNameIn = args[1];
			
			File filePath = new File(filePathIn+fileNameIn);

			scannedFile = new Scanner(filePath);
			
			String fileContent = "";
			String editedContent = "";		
			
			try {
				while(scannedFile.hasNextLine()) {
				
				fileContent = fileContent.concat(scannedFile.nextLine() + "\n");
				
				}
			System.out.println(fileContent);

				if(fileContent != null) {
					String outText = fileContent.replaceAll("\"(.+)\"", "$1");
					outText = outText.replace("\"\"", "\"");
					
					System.out.println(outText);
					
					editedContent = outText;
				}
			
			
			}catch(Exception e){ 
	            System.err.printf("No se encontro archivo");
	        }
				String fileNameOut = "depured-"+fileNameIn;
				
				FileWriter writer = new FileWriter(filePathIn + fileNameOut);//output file
				writer.write(editedContent);

				writer.close();
		}else {
			System.out.println("Please provide pathfile and filename");
		}
	}

}
	