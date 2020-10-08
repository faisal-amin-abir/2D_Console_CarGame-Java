import java.util.Scanner;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
public class login {
	    static boolean flag = true;
		static String user;
		
        Scanner input = new Scanner(System.in);
        public login() throws Exception
		{
			while(flag)
			{
                try{CleanScreen();}catch(Exception e){}
			    
				File file = Admin.file;
				
				FileReader reader = new FileReader(file);
				BufferedReader bfr = new BufferedReader(reader);
				
				for(int i=0; i<4; i++)System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("#");
                System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("-");
                for(int i =0; i<1; i++)System.out.println();
                for(int i =0; i<70;i++)System.out.print(" ");
                System.out.println("Login Page");
                System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("-");
                System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("#");
                System.out.println();
                System.out.println();
                
				System.out.println();
				for(int i =0; i< 50; i++)System.out.print(" ");
				for(int i = 0; i<27; i++)System.out.print("* ");
                System.out.println();
				for(int i =0; i< 50; i++)System.out.print(" ");
				for(int i = 0; i<27; i++)System.out.print("* ");
                System.out.println();
			
			
			    String pass;
                //user
                System.out.println();
                for(int i =0; i<65;i++)System.out.print(" ");
                System.out.print("Enter Your username: ");
				user=input.nextLine();
                for(int i =0; i<70;i++)System.out.print(" ");
               
                
                //password
                for(int i =0; i<1; i++)System.out.println();
                for(int i =0; i<65;i++)System.out.print(" ");
                System.out.print("Enter Your Password: ");
				pass=input.nextLine();
                for(int i =0; i<70;i++)System.out.print(" ");
				
				
                System.out.println();
				for(int i =0; i< 50; i++)System.out.print(" ");
				for(int i = 0; i<27; i++)System.out.print("* ");
                System.out.println();
				for(int i =0; i< 50; i++)System.out.print(" ");
				for(int i = 0; i<27; i++)System.out.print("* ");
                System.out.println();
				
				
                int x =0;
				boolean check = false;
				String temp;
				while((temp = bfr.readLine())!= null)
				{
				    if(temp.contains(user))
					{
						temp = bfr.readLine();
						if(temp.contains(pass))
						{
							
							check = true;
							break;
						}
						
					}	
				}
				reader.close();
					if (check){
						try{CleanScreen();}catch(Exception e){}
						new login2();
					}
					else {
						System.out.println();
						for(int i =0; i<62;i++)System.out.print(" ");
						System.out.println("Incorrect Username or Password");
						for(int i =0; i<76;i++)System.out.print(" ");
						System.out.println("Or");
						for(int i =0; i<67;i++)System.out.print(" ");
						System.out.println("Username is not found");
						
						System.out.println();
						for(int i =0; i< 50; i++)System.out.print(" ");
						for(int i = 0; i<27; i++)System.out.print("* ");
						System.out.println();
						for(int i =0; i< 50; i++)System.out.print(" ");
						for(int i = 0; i<27; i++)System.out.print("* ");
						System.out.println();
						
						System.out.println();
						for(int i =0; i<54;i++)System.out.print(" ");
						System.out.println("Press and Enter the key for the following action.");
						for(int i =0; i<70;i++)System.out.print(" ");
						System.out.println("a. Retry");
						for(int i =0; i<70;i++)System.out.print(" ");
						System.out.println("b. Register");
						for(int i =0; i<70;i++)System.out.print(" ");
						System.out.println("c. Quit");
						
						System.out.println();
						for(int i =0; i< 50; i++)System.out.print(" ");
						for(int i = 0; i<27; i++)System.out.print("* ");
						System.out.println();
						for(int i =0; i< 50; i++)System.out.print(" ");
						for(int i = 0; i<27; i++)System.out.print("* ");
						System.out.println();
						char c = input.next().charAt(0);
						if( c == 'b')
						{
                           try{
								 CleanScreen();
							}catch(Exception e){}
							new Admin();
						}else if( c == 'c')
						{
                           try{
								 CleanScreen();
							}catch(Exception e){}
							new End();
						}
						input.nextLine();
					}
				}
        }
    public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}