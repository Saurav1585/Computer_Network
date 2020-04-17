import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
class bin
{ 
	public static void main(String[] args) throws IOException 
	{ 
		int ch;
		
		FileReader fr=null; 
		try
		{ 
			fr = new FileReader("text"); 
		} 
		catch (FileNotFoundException fe) 
		{ 
			System.out.println("File not found"); 
		} 

		while ((ch=fr.read())!=-1) 
		{
			System.out.print(Integer.toBinaryString(ch));
		}
		
		fr.close(); 
		//System.out.print(count);
	} 
} 

