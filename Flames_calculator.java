//Flames calculator
import java.util.*;

class Flames
{ 
    
    void calculation(int b,int g)
    {
        
        
        char boy[]=new char[b];
        char girl[]=new char[g];
      
        	    
	    Scanner r=new Scanner(System.in);
	    //enter Boy friend name
	    
	    int i=0;
	    
	    System.out.println("Enter Boy name:");
	    for(i=0;i<b;i++)
	    { 
	        
	        boy[i]=r.next().charAt(0);
	        
	        
	    }
	    
	    
	    
	    System.out.println("Enter Girl  name:");
	     
        for(i=0;i<g;i++)
	    { 
	        
	        girl[i]=r.next().charAt(0);
	        
	        
	    }
	    
	    
	    //check for Same 
	    
	    int to=b+g;
	    
	    int c=0;
	    for(i=0;i<b;i++)
	    { 
	        
	        
	        
	        for(int j=0;j<g;j++)
	        { 
	        
	            if(boy[i]==girl[j])
	            { 
	               
	                c=c+1;
	                
	            }
	            
	            
	        }
	        
	        
	    }
	    c=c*2;
	    int del=to-c;
	    System.out.println("Total count :"+del);
	    
	   
        String flames = "flames";
        StringBuilder sb3 = new StringBuilder(flames);
        
        char flameResult = 0;
         char relationIs=0;
        while(sb3.length()!=1)
        {
            int y = to%sb3.length(); 
            String temp;
            
            if(y!=0)
            {
                temp = sb3.substring(y)+sb3.substring(0, y-1); // taking substring (counting purpose)
                
            }
            else
            {
                temp = sb3.substring(0, sb3.length()-1); // taking substring (counting purpose)
                
            }
            sb3 = new StringBuilder(temp);
          relationIs = sb3.charAt(0);
            
        }
        System.out.println(relationIs);
	    
	     switch(relationIs)
        {
            case 'f':
                System.out.println("he and she are Friends");
                break;
            case 'l':
                System.out.println("he and she are in Love");
                break;
            case 'a':
                System.out.println("he and she are in Affection");
                break;
            case 'm':
                System.out.println("he and she are in Marriage");
                break;
            case 'e':
                System.out.println("he and she are in Enemies");
                break;
            case 's':
                System.out.println("he and she are in Sibling");
                break;
                
        }
	    
	    
	    
	    
	    
	    
    
    
    }
    
}


public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
	    Flames fl=new Flames();
	    
	    System.out.println("Flames calculator");
	    
	    System.out.println("Enter boy and girl name length:");
	    
	    int b=s.nextInt();
	    int g=s.nextInt();

	    fl.calculation(b,g);
	    
	    
	    
		
		
	}
}
