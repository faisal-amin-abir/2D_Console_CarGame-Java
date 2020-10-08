import java.util.Scanner;
import java.io.*;

public class login2 {
        Scanner input = new Scanner(System.in);
        public login2() {
            try{
				CleanScreen();
			}catch(Exception e){}
			    
				for(int i=0; i<10; i++)System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("#");
                System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("-");
                for(int i =0; i<1; i++)System.out.println();
                for(int i =0; i<70;i++)System.out.print(" ");
                System.out.println("Login Successful");
                System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("-");
                System.out.println();
                for(int i = 0 ; i<166; i++)
                System.out.print("#");
                System.out.println();
                
                
                
                
                for(int i =0; i<2; i++)System.out.println();
                for(int i =0; i<60;i++)System.out.print(" ");
                System.out.print("Press and 'Enter' the 'a' for the Next");
				
                for(int i =0; i<20;i++)System.out.println();
                char user=input.next().charAt(0);
         
                //conditions
                if (user == 'a'){
					try{CleanScreen();}catch(Exception e){}
                    new Index();
                }
        }
    public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}