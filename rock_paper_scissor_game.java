import java.util.*;

class game
{ 
    
    void roles(String p1,String p2)
    { 
        
        
        if(p1.equals(p2))
        { 
            
            System.out.println("Tie");
            
        }
        else
        { 
            
            
            if(p1.equals("rock")&&p2.equals("paper"))
            { 
                
                System.out.println("p2 win..");
                
                
            }
            else if(p1.equals("paper")&&p2.equals("rock"))
            { 
                
                 System.out.println("p1 win..");
                
            }
            else if((p1.equals("scissor")&&p2.equals("paper")))
            { 
                
                
                 
                 System.out.println("p1 win..");
                
            }
            
            else if((p1.equals("paper")&&p2.equals("scissor")))
            { 
                
                
                 
                 System.out.println("p2 win..");
                
            }
            else if((p1.equals("scissor")&&p2.equals("rock")))
            { 
                
                
                 
                 System.out.println("p2 win..");
                
            }
            else if((p1.equals("rock")&&p2.equals("scissor")))
            { 
                
                
                 
                 System.out.println("p1 win..");
                
            }
            
            
            
            
        }
        
        
        
        
    }
    
    
    
    
}

public class Main
{
	public static void main(String[] args) {
	    
	    //Rock & papper & scissor game

        Scanner s=new Scanner(System.in);

        System.out.println("Player 1:");
        String player1=s.nextLine();
        
        System.out.println("Player 2:");
        String player2=s.nextLine();
        
        int c=1;
        
        if((player1.equals("rock")||player1.equals("paper")||player1.equals("scissor")))
        {

            
            if(player2.equals("rock")||player2.equals("paper")||player2.equals("scissor"))
            {
        
                game g=new game();    	    
	    
	            g.roles(player1,player2);
                c=2;
            }
        }
        else
        { 
           
                
            System.out.println("Invalid Inputs...");
            
        }
		
	}
}
