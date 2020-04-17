import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
class net
{ 
	public static void main(String[] args) throws IOException 
	{ 
		int ch; 
		int count=0;
		String word = "science";
		String a="";
		char x=' ';
		
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
			//System.out.print((char)ch);
			if ((char)ch !=x)
			{
				a=a+Character.toString((char)ch);
				
			
    			if (word.equals(a)) 
        			count++; 
    			}
			
			if ((char)ch ==x)
				a="";
		}
		
		fr.close(); 
		System.out.print(count);
	} 
} 

