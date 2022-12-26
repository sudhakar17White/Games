import java.util.*;
import java.io.*;

class Game
{ 
    Game(int size)
    {
    
    Scanner s=new Scanner(System.in);
    
    int player1[]=new int[size];
    int player2[]=new int[size];
        //input form user
        for(int i=0;i<size;i++)
        { 
        
            System.out.println("Round:"+(i+1));
            System.out.print("player:1 -");
            player1[i]=s.nextInt();
            System.out.print("player:2 -");
            player2[i]=s.nextInt();
            
        
        }
        
        //to find leader of array 
        
        String leader[]=new String[size];
        for(int i=0;i<size;i++)
        { 
        
           if(player1[i]>player2[i])
           { 
               
               leader[i]="Player 1";
               
           }
           else
           { 
               
               leader[i]="player 2";
               
           }
        
        }
    
        
        
        //to find lead
        int lead[]=new int[size];
        
         for(int i=0;i<size;i++)
        { 
        
           if(player1[i]>player2[i])
           { 
               
              lead[i]=player1[i]-player2[i];
               
           }
           else
           { 
               
               lead[i]=player2[i]-player1[i];
               
           }
        
        }
        
        //Print all 
        System.out.println("Table view:");
        
        System.out.println("Round   Player1  Player2  Leader       Lead");
        for(int i=0;i<size;i++)
        { 
            
           System.out.println((i+1)+"       "+player1[i]+"        "+player2[i]+"       "+leader[i]+"     "+lead[i]); 
          
        }
        
        //result and winner
        int max=lead[0];
        int pr=0;
        for(int i=1;i<size;i++)
        { 
            
            
            if(lead[i]>max)
            { 
                
                max=lead[i];
                pr=i;                                                                      
                
            }
            
            
        }
        
        System.out.println("Winner is Round:"+(pr+1)+" and The leader of "+leader[pr]+" is the highest lead "+max);
       
    
    }
    
    
    
}

public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("THE LEAD GAME");
		
		System.out.println("Enter the size:");
		
		int size=s.nextInt();
		
		Game g=new Game(size);
		
		
		
		
	}
}
