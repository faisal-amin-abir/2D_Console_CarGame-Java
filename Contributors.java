import java.util.Scanner;

public class Contributors
{
	public Contributors()
	{
		Scanner input = new Scanner(System.in);
		String faisalName = "Faisal Amin Abir";
		String faisalID = "20-43206-1";
		String faisalEmail = "20-43206-1@student.aiub.edu";
		
		String anikName = "Mehedi Hasan Anik";
		String anikID = "20-42695-1";
		String anikEmail = "20-42695-1@student.aiub.edu";
		
		String masaviName = "Syed Masavi";
		String masaviID = "20-42703-1";
		String masaviEmail = "20-42703-1@student.aiub.edu";
	
		String Department = "Bsc. in Computer Science and Engineering, AIUB";
		
		for(int i =0; i<3; i++)System.out.println();
		
		for(int i = 0; i<166; i++)
		{
			System.out.print("#");
		}
		System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("-");
		}
		System.out.println();
		
		for(int i =0; i<67; i++)
		System.out.print(" ");
		System.out.println("<<<Contributors Description>>>");
		System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("-");
		}System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("#");
		}
		for(int i =0; i< 3; i++)
		System.out.println();
    	for(int i =0; i<2;i++)System.out.println();
		for(int i =0; i< 3; i++)System.out.print(" ");
		
		
		System.out.print("1."+faisalName);
		for(int i =0; i<40; i++)System.out.print(" ");
		System.out.print("2."+anikName);
		for(int i =0; i<40; i++)System.out.print(" ");
		System.out.println("3."+masaviName);
		System.out.println();
		
		
		for(int i =0; i< 3; i++)System.out.print(" ");
		System.out.print("ID: "+faisalID);
		for(int i =0; i<44; i++)System.out.print(" ");
		System.out.print("ID: "+anikID);
		for(int i =0; i<45; i++)System.out.print(" ");
		System.out.println("ID: "+masaviID);
		
		
		for(int i =0; i< 3; i++)System.out.print(" ");
		System.out.print(Department);
		for(int i =0; i<12; i++)System.out.print(" ");
		System.out.print(Department);
		for(int i =0; i<13; i++)System.out.print(" ");
		System.out.println(Department);
		
		
		for(int i =0; i< 3; i++)System.out.print(" ");
		System.out.print(faisalEmail+", 2nd Semester");
		for(int i =0; i<17; i++)System.out.print(" ");
		System.out.print(anikEmail+", 2nd Semester");
		for(int i =0; i<18; i++)System.out.print(" ");
		System.out.println(masaviEmail+", 2nd Semester");
		
		for(int i =0; i<6;i++)System.out.println();
		for(int i =0; i<60; i++)System.out.print(" ");
		
		System.out.print("Press and Enter 'a' for exit.");
		
		for(int i =0; i<2;i++)System.out.println();
		for(int i =0; i< 70; i++)System.out.print(" ");
		
		
		for(int i = 0 ; i <14; i++)System.out.println();
		char d = input.next().charAt(0);
		if(d == 'a'){new Index();}
	}
}