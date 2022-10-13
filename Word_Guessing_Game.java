/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author sudhakar
 */
public class Word_Guessing_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
import java.util.*;


/**
 *
 * @author sudhakar
 */

class Game {

    void win(String name,int ch) {
        
        System.out.println("\nGame Over\n");
        System.out.println("Player Name :"+name);
        System.out.println("\nReminig Choice :"+ch);
        System.out.println("\nYou Won...");
        

    }
    void lose(String name) {
        
        System.out.println("\nGame Over\n");
        System.out.println("\nPlayer Name :"+name);
        System.out.println("\nYou lose...Better luck next Time");
        
        

    }

}

public class Word_Guessing_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Word Guessing Game\n");

        Scanner s = new Scanner(System.in);

       String off;   
      do{  
          
         
        System.out.println("\nEnter the Player name:");
        String name=s.nextLine();
        
        Game g=new Game();
        
        System.out.println("\nGame Limit:");
        int limit = s.nextInt();

        System.out.println("\nHow many Choice to Find:");
        int ch = s.nextInt();
        
        int range=limit-0+1; 
        
        int rand = (int)(Math.random() * range) + 0;
        
        int a[] = new int[limit];

        System.out.print("\nNumbers are :\n");
        for (int i = 0; i <limit; i++) {

            a[i] = i;
        }

        System.out.print("[");
        for (int i = 0; i <limit; i++) {

            System.out.print(a[i]+" ");

        }

        System.out.println("]");
        
        //System.out.println(rand);
        
    
        for(int i=1;i<=limit;i++)
        { 
        
            System.out.println("\nEnter number:");
            int num=s.nextInt();
            
            if(ch==0)
              {
              
                    g.lose(name);
                    break;
              
              }
            
            else
              {
                if(num==rand)
                { 
                    g.win(name,ch);
                    break;

                }

                else if(num<rand)
                { 

                    System.out.println("\nless than wining Point");
                    ch=ch-1;


                }
                else if(num>rand)
                { 


                    System.out.println("\nGreater than wining Point");
                    ch=ch-1;

                }
           }       
            
        
        }
        System.out.println("\n\nExit (x) or Play (p)");
        off=s.next();
          
      }while(off.equals("p"));
       
    }

}
