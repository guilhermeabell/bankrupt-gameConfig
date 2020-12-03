import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
public class Bankrupt {  
  public static void main(String[] args) {
	  
	  
	   props print = new props(10, 11);
	   
	   ArrayList<props> Lista =   new ArrayList <props>
	   ();
	   
	   File Arquivo = new File("C:/Users/Guilherme/Downloads/Desafio+Tapps+Games/Desafio Tapps Games/gameConfig.txt");
	      Scanner myReader;
		try {
			myReader = new Scanner(Arquivo);
			while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		       String[] dados =  data.split(" ");
		        System.out.println(dados[0]+ ","+ dados[1]);
		        
		        int valor = Integer.parseInt(dados[0]);
		      }
		      myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	   
	   for (int i=0; i<Lista.size();i++ )
	   { Lista.get(i).print();
	   
	   
		   
	   }
	   
	   System.out.println("Finish");
	   
	   
		  
	 
	 

	  
  }
  
}


  