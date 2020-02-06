
	import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader; 
	
public class Javalearning {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String userName = "";
	public static void main(String args[]) throws IOException{ 
		System.out.println("1.Register \n2.Login\nEnter Choice: ");
		String choice = br.readLine();
		System.out.println(choice);
		boolean value = false;
		switch(choice)
		{
		case "1" : 
			registration();
			break;
		case "2":
			value = login();
			break;
		}
	if(value) 
	{
		System.out.println("1.Save credentials \n2.Retrieve credentials ");
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String select = br.readLine();
		System.out.println(select);
		switch(select)
		{
		case "1":
			savecred(userName);
			break;
		case "2":
			retrievecred(userName);
			break;
		default:
			break;
			
		}
       }

       
	}

	//		main(Args[]);
		
		  
	
		 public static void registration()
		 {
			 Scanner in = new Scanner(System.in);
	          System.out.print("Enter your name: ");  
			String name = in.nextLine();  
	          System.out.print("Enter your password: ");  
			String password = in.nextLine();         
	          //in.close();
	          try{  
	        	  String str = name+","+password;
	              FileWriter fw=new FileWriter("src/main/java/test.txt",true);    
	              fw.write(str);
	              fw.close();    
	             }catch(Exception e){System.out.println(e);}  
	          System.out.println("Registration successful");
		 }
		 
		 public static boolean login()
		 {
			 Scanner in = new Scanner(System.in);
			 System.out.print("Enter your name: ");  
				String name = in.nextLine();  
		          System.out.print("Enter your password: ");
		          String password = "";
		          if(in.hasNext()) {
		        	  
		        	  password = in.nextLine();         
		          }
		        
		          String str = "";
	         
	          try {
	        	  File file = new File("src/main/java/test.txt"); 
	        	  
	        	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	        	  
	        	  String cred; 
	        	  
	        	  while ((cred = br.readLine()) != null) {
	        		str =  str + cred;
	        	  }
	        	 
	        	  
//	        	    
	        	 

			} catch (Exception e) {
				// TODO: handle exception
			}
	          //in.close();
	          String credentials[] = str.split(",");
	          System.out.println(credentials[0]+credentials[1]);
	          System.out.println(name+password);
	          if(name.equals(credentials[0])  && password.equals(credentials[1])) {
	        	  System.out.println("Login successful");
	        	  userName = name;
	        	  return true;
	          }
	          else {
	        	  System.out.println("Login failed");
	        	  return false;
	          }
	               
		 }
		 public static void savecred (String user)
		 {
			 Scanner s = new Scanner(System.in);
			 System.out.println("Which platform do you want to save credentials for?");
			 String platform = s.nextLine();
			 System.out.println("Enter your username");
			 String credname = s.nextLine();
			 System.out.println("Enter your password");
			 String credpassword = s.nextLine();
			// s.close();

	          try{  
	        	  String str = platform+","+credname+","+credpassword+","+user+";";
	              FileWriter fw =new FileWriter("src/main/java/savecred.txt",true);    
	              BufferedWriter bw = new BufferedWriter(fw);
	              bw.write(str);
	              bw.close();
	              fw.close();    
	             }catch(Exception e){
//	            	 System.out.println(e);
	            	 }  
	          System.out.println("Credentials stored successfully");
		 }
			 public static void retrievecred(String username)
			 {
				 Scanner input = new Scanner(System.in);
				 System.out.print("Which platform do you want to retrieve credentials for?");  
					String platform = input.nextLine();  
			         // input.close();
			          String str = "";
		         
		          try {
		        	  File file = new File("src/main/java/savecred.txt"); 
		        	  
		        	  BufferedReader br = new BufferedReader(new FileReader(file)); 
		        	  
		        	  String cred; 
		        	  
		        	  while ((cred = br.readLine()) != null) {
		        		str =  str + cred;
		        	  }
		        	 

				} catch (Exception e) {
				}
		          String details = "";
		          String credentials[] = str.split(";");
		          for(int i =0; i< credentials.length; i++) {
		        	  String cred[] = credentials[i].split(",");
		        	  
		        	  System.out.println(cred[0]);
		        	  if(platform.equals(cred[0])&& username.equals(cred[3])) {
		        		  details = credentials[i];
		        		  break;
		        	  }
		          }
		          System.out.println(details);
		          //System.out.println(credentials[0]+credentials[1]+credentials[2]);
		          
			 }
			 
			 
			 
		 }
		 

	
	