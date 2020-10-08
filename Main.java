import java.util.Scanner;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JFrame;
import java.io.IOException;

class Car
{
    int x1, x2;
	int y1,y2;
	public Car(int w, int y)
	{
		x1 = w/2;
		x2 = x1+9;
		y1 = y/2;
		y2 = y1+7;		
	}
	
}
class opponentCar
{
	int x1, x2;
	int y1,y2;
	public opponentCar(int w, int y)
	{
		
		//x1 = rand.nextInt(w)-10;
		//if(x1 < 0) x1 = 0;
		x1 = w;
		x2 = x1+9;
		y1 = y;
		y2 = y1+7;		
	}
}
public class Main extends JFrame
{
	static Scanner input = new Scanner(System.in);
	static boolean gameOver = false;
	static int width = 90;
	static int length = 42;
	static char dir = '0';
	Random rand = new Random();
	static Car c = new Car(width, length);
	static int score = 0;
	static int Speed = 0;
	static int totalGamePlayed = 0;
	static int [] highestScore = new int[1000];
	static int coin = 0;
	static int countPresentCoins = 0;
	static opponentCar opCar1 = new opponentCar((width/2),-84);
	static opponentCar opCar2 = new opponentCar(2,-42);
	static opponentCar opCar3 = new opponentCar(70,-42);
	static opponentCar opCar4 = new opponentCar(13,-126);
	public  void run()
	{
		int k =0;
		
			while(!gameOver)
			{
				try
				{
				   CleanScreen();
			    }
				
				catch(Exception e){}
				
				update(width, length);
				draw(width, length);
				
				}
		
	}
	
	public static void CleanScreen() throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	
	public  void update(int w, int l)
	{
		opCar1.y1+=2;
		opCar1.y2+=2;
		if(opCar1.y2 >(length+10))
		{
		  opCar1.y1 =-10;
		  opCar1.y2 = opCar1.y1+7;
		  opCar1.x1 = rand.nextInt(w-8);
		  opCar1.x2 = opCar1.x1+9;
		}
		
		opCar2.y1+=8;
		opCar2.y2+=8;
		if(opCar2.y2 >(length+10))
		{
		  opCar2.y1 =-100;
		  opCar2.y2 = opCar2.y1+7;
		  opCar2.x1 = rand.nextInt(w-8);
		  opCar2.x2 = opCar2.x1+9;
		}
		
		opCar3.y1+=4;
		opCar3.y2+=4;
	    if(opCar3.y2 >(length+10))
		{
		  opCar3.y1 =-200;
		  opCar3.y2 = opCar3.y1+7;
		  opCar3.x1 = rand.nextInt(w-8);
		  opCar3.x2 = opCar3.x1+9;
		}
		
		opCar4.y1+=8;
		opCar4.y2+=8;
	    if(opCar4.y2 >(length+10))
		{
		  opCar4.y1 =-300;
		  opCar4.y2 = opCar4.y1+7;
		  opCar4.x1 = rand.nextInt(w-8);
		  opCar4.x2 = opCar4.x1+9;
		}
		
		
		if(!gameOver)
		{
			score +=10;
			countPresentCoins = score/100;
			if( dir == 's') // down
			{
				if(c.y2<=l-4)
				{
					c.y1+=4;
					c.y2+=4;
				}
			}else if(dir == 'w')//up
			{
				if(c.y1>=4)
				{
					c.y1-=4;
					c.y2-=4;
				}
			}else if(dir == 'a')//left
			{
				if(c.x1>=2)
				{
					c.x1-=5;
					c.x2-=5;
				}
			}else if (dir == 'd')
			{
				if(c.x2<=w-4)
				{
					c.x1+=5;
					c.x2+=5;
				}
			}
			
			for(int i = c.x1+1; i<=c.x2+1; i++)
			{
				for(int j = c.y1; j <= c.y2; j++)
				{
					if((i >= (opCar1.x1+1)) && (i <= (opCar1.x2+1)) && (j >= opCar1.y1) && (j <= opCar1.y2))
					{
						gameOver = true;
						c.x1 = w/2;
						c.x2 = c.x1 +9;
						c.y1 = l/2;
						c.y2 = c.y1+7;	
						opCar1.y1 =-84;
						opCar1.y2 = opCar1.y1+7;
						opCar2.y1 =-42;
		                opCar2.y2 = opCar2.y1+7;
						opCar3.y1 =-42;
		                opCar3.y2 = opCar3.y1+7;
						opCar4.y1 =-126;
		                opCar4.y2 = opCar4.y1+7;
					}
					if((i >= (opCar2.x1+1)) && (i <= (opCar2.x2+1)) && (j >= opCar2.y1) && (j <= opCar2.y2))
					{
						gameOver = true;
						c.x1 = w/2;
						c.x2 = c.x1 +9;
						c.y1 = l/2;
						c.y2 = c.y1+7;	
						opCar1.y1 =-84;
						opCar1.y2 = opCar1.y1+7;
						opCar2.y1 =-42;
		                opCar2.y2 = opCar2.y1+7;
						opCar3.y1 =-42;
		                opCar3.y2 = opCar3.y1+7;
						opCar4.y1 =-126;
		                opCar4.y2 = opCar4.y1+7;
					}
					if((i >= (opCar3.x1+1)) && (i <= (opCar3.x2+1)) && (j >= opCar3.y1) && (j <= opCar3.y2))
					{
						gameOver = true;
						c.x1 = w/2;
						c.x2 = c.x1 +9;
						c.y1 = l/2;
						c.y2 = c.y1+7;	
						opCar1.y1 =-84;
						opCar1.y2 = opCar1.y1+7;
						opCar2.y1 =-42;
		                opCar2.y2 = opCar2.y1+7;
						opCar3.y1 =-42;
		                opCar3.y2 = opCar3.y1+7;
						opCar4.y1 =-126;
		                opCar4.y2 = opCar4.y1+7;
					}
					if((i >= (opCar4.x1+1)) && (i <= (opCar4.x2+1)) && (j >= opCar4.y1) && (j <= opCar4.y2))
					{
						gameOver = true;
						c.x1 = w/2;
						c.x2 = c.x1 +9;
						c.y1 = l/2;
						c.y2 = c.y1+7;	
						opCar1.y1 =-84;
						opCar1.y2 = opCar1.y1+7;
						opCar2.y1 =-42;
		                opCar2.y2 = opCar2.y1+7;
						opCar3.y1 =-42;
		                opCar3.y2 = opCar3.y1+7;
						opCar4.y1 =-126;
		                opCar4.y2 = opCar4.y1+7;
					}
				}
			}if(gameOver)
			{
				coin += countPresentCoins; 
				this.setVisible(false);
				try{
					CleanScreen();
					
				}catch(Exception e){}
				highestScore[totalGamePlayed] = score;
				totalGamePlayed++;
				new GameOver();
			}
			
		}dir = '0';
		}
	public void draw(int w, int l)
	{
		if(!gameOver)
		{
			
			
			for(int i=0; i<l+1; i++)
			{
				for(int k=0; k<17;k++)System.out.print(" ");
				for(int j =0; j<w+3; j++)
				{
					if(j==0)
					{
						System.out.print("|#|");
					}
					
					else if( (i >= c.y1) && (j >= (c.x1+1)) && ( i <= c.y2 ) && (j <=  (c.x2+1)))
					{
						System.out.print("0");
					} 
					else if(((i >= opCar1.y1) && (j >= (opCar1.x1+1)) && ( i <= opCar1.y2 ) && (j <=  (opCar1.x2+1))))
					{
						System.out.print("0");
					} 
					else if(((i >= opCar2.y1) && (j >= (opCar2.x1+1)) && ( i <= opCar2.y2 ) && (j <=  (opCar2.x2+1))))
					{
						System.out.print("0");
					}
					else if(((i >= opCar3.y1) && (j >= (opCar3.x1+1)) && ( i <= opCar3.y2 ) && (j <=  (opCar3.x2+1))))
					{
						System.out.print("0");
					} 
					else if(((i >= opCar4.y1) && (j >= (opCar4.x1+1)) && ( i <= opCar4.y2 ) && (j <=  (opCar4.x2+1))))
					{
						System.out.print("0");
					} 
					else if(j == (w/2))
					{
						System.out.print("|");
					}
					else if(j == (w+2))
					{
						if(i == l-5)
						{
							System.out.print("|#|");
							for(int k =0; k<5; k++)
						    { 
							   System.out.print(" ");
						    }System.out.print("Score: "+score);
						    System.out.print(" ");
						    System.out.print(" ");
							System.out.println("Coins: "+countPresentCoins);
							
						}else if(i == l-22)
						{
							System.out.print("|#|");
							for(int k =0; k<5;k++)
							{
								System.out.print(" ");
							}
							System.out.println("Press 's', 'w',  'a'  and 'd' for movement");
						}else if(i == l-20)
						{
							System.out.print("|#|");
							for(int k =0; k<5; k++)
							{
								System.out.print(" ");
							}System.out.println("Player name: "+login.user);
						}else 
                            System.out.println("|#|");							
						
					}
					else{
						System.out.print(" ");
					}
				}
				
			}
	
			
			
			
		}
		
			
	}
	
	public Main()
	{
		for(int i =0; i<14;i++)System.out.println();
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
		System.out.println();
		
		
		
		for(int i =0; i<70; i++)
		System.out.print(" ");
	    
		System.out.print("PRESS ENTER TO START");
		
		
		System.out.println();
		
		System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("-");
		}System.out.println();
		for(int i = 0; i<166; i++)
		{
			System.out.print("#");
		}
			//System.out.println("**************************************");
			while(true)
			{
				String s = input.nextLine();
				if(s.equals(""))
				{
					this.setSize(10, 10);
					this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					this.setTitle("ads");
					this.setVisible(true);
					this.addKeyListener(new KeyAdapter() {
						public void keyPressed(KeyEvent e) {
							dir = e.getKeyChar();
							//e.consume();				
						}
					});
					run();
					break;
				}else System.out.println("Pressed.."+s);
			}
	}
	
	
	
}



















