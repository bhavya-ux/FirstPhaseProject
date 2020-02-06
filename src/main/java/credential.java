import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class credential {
	
	 public static void savecred ()
	 {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Which platform do you want to save credentials for?");
		 String platform = s.nextLine();
		 System.out.println("Enter your username");
		 String credname = s.nextLine();
		 System.out.println("Enter your password");
		 String credpassword = s.nextLine();
		 s.close();

          try{  
        	  String str = platform+","+credname+","+credpassword;
              FileWriter fw =new FileWriter("src/main/java/savecred.txt");    
              fw.write(str);
              fw.close();    
             }catch(Exception e){
//            	 System.out.println(e);
            	 }  
          System.out.println("Credentials stored successfully");
	 }
		 public static void retrievecred()
		 {
			 Scanner input = new Scanner(System.in);
			 System.out.print("Which platform do you want to retrieve credentials for?");  
				String platform = input.nextLine();  
		          input.close();
		          String str = "";
	         
	          try {
	        	  File file = new File("src/main/java/savecred.txt"); 
	        	  
	        	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	        	  
	        	  String cred; 
	        	  
	        	  while ((cred = br.readLine()) != null) {
	        		str =  str + cred;
	        	  }
	        	 
	        	  
//	        	    
	        	 

			} catch (Exception e) {
				// TODO: handle exception
			}
	          String credentials[] = str.split(",");
	          System.out.println(credentials[0]+credentials[1]+credentials[2]);
//	          System.out.println(platform);
	          
		 }
		 


}
