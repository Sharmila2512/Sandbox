
// Reading a file of objects sequentially with ObjectInputStream
// and displaying each record.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;     
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;      
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;

public class ReadSequentialFile
{
   private static ObjectInputStream input;

   public static void main(String[] args) throws IOException, ClassNotFoundException
   {
      openFile();
      readRecords();
      closeFile();
      writeToFile();
      
   } 

   
   // enable user to select file to open
   public static void openFile()
   {
      try // open file
      {
         input = new ObjectInputStream(          
            Files.newInputStream(Paths.get("payrolldata.txt")));
        
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file.");
         System.exit(1);
      } 
   }
//   public static void openSecondFile()
//   {
//      try // open file
//      {
//         input = new ObjectInputStream(          
//            Files.newInputStream(Paths.get("grosspay.txt")));
//      } 
//      catch (IOException ioException)
//      {
//         System.err.println("Error opening file.");
//         System.exit(1);
//      } 
//   }

   // read record from file
   public static void readRecords() throws IOException
   {
     System.out.printf("%-10s%-12s%-12s%10s%13s%n", "Employee",
         "First Name", "Last Name", "hours", "pay rate");

	   /*BufferedReader inputStream = new BufferedReader(new FileReader(
			   "payrolldata.txt"));
	     File UIFile = new File("grosspay.txt");
	        // if File doesnt exists, then create it
	        if (!UIFile.exists()) {
	            UIFile.createNewFile();
	        }
	    FileWriter filewriter = new FileWriter(UIFile.getAbsoluteFile());
	    BufferedWriter outputStream= new BufferedWriter(filewriter);
	    String count;
	    while ((count = inputStream.readLine()) != null) {
	        outputStream.write(count);
	    }
	    outputStream.flush();
	    outputStream.close();
	    inputStream.close();
   }*/
       try 
      {
         while (true) // loop until there is an EOFException
         {
            Employee record = (Employee) input.readObject();

            // display record contents
            System.out.printf("%-10d%-12s%-12s%10.2f%10.2f%n",  
               record.getEmpId(), record.getFirstName(), 
               record.getLastName(), record.getHours(), record.getPayRate());
            
           
	    }
            
         
      }
      catch (EOFException endOfFileException)
      {
         System.out.printf("%nNo more records%n");
      } 
      catch (ClassNotFoundException classNotFoundException)
      {
         System.err.println("Invalid object type. Terminating.");
      } 
      catch (IOException ioException)
      {
         System.err.println("Error reading from file. Terminating.");
      } 
   } // end method readRecords

   // close file and terminate application
   public static void closeFile()
   {
      try
      {
         if (input != null)
            input.close();
      } 
      catch (IOException ioException)
      {
         System.err.println("Error closing file. Terminating.");
         System.exit(1);
      } 
   } 
   
   private static void writeToFile() throws ClassNotFoundException, IOException{
	   input = new ObjectInputStream(          
	            Files.newInputStream(Paths.get("payrolldata.txt")));
	   Employee record = (Employee) input.readObject();
	   File UIFile = new File("h://grosspay.txt");
       // if File doesnt exists, then create it
       if (!UIFile.exists()) {
           UIFile.createNewFile();
       }
   FileWriter filewriter = new FileWriter(UIFile.getAbsoluteFile());
   BufferedWriter outputStream= new BufferedWriter(filewriter);
   	outputStream.write(String.format("%-10s %-10s %-10s %-10s", "Employee", "First Name", "Last Name", "Gross Pay"));
  		outputStream.newLine();
  		outputStream.write(String.format("%-10s %-10s %-10s %-10s", record.getEmpId(), record.getFirstName(), record.getLastName(), record.getGrossPay()));
       outputStream.flush();
	    outputStream.close();
	    
	    input.close();
   }
} // end class ReadSequentialFile
