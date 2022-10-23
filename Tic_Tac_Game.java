import java.util.*;

class Tictic
{ 
    
    int a[][]=new int[3][3];
		
    	Scanner s=new Scanner(System.in);
		
    
    void print()
    { 
        
        	for(int i=0;i<3;i++)
		{ 
		 
		 
		    
	    	for(int j=0;j<3;j++)
		    { 
		    
		        System.out.print(a[i][j]+"      ");
		    
		    
		    }   
		    System.out.println("\n");
		    
		}
        
        
        
        
        
        
    }
    void player1(int v)
    {
    
       
        
        int i=s.nextInt();
        int j=s.nextInt();
        if((i>=0&&i<3)&&(j>=0&&j<3))
        {
    
        a[i][j]=v;
    
        }
        else
        { 
        
            System.out.println("Invalid postion");    
            
        }
    
        //to check row
        int c=0;
        for(int k=0;k<3;k++)
        { 
            
            for(int l=0;l<3;l++)
            { 
                
                
                if(a[k][l]==v)
                {
                
                    
                    c=c+1;
                    if(c==3)
                    { 
                        
                        break;
                        
                    }
                
                }
                
            }
           if(c==3)
         { 
                
           System.out.println("\n\nplayer 1 win");
           System.exit(0);
           break;
          
         }
              
          
            
        }
        int r=0;
         for(int l=0;l<3;l++)
        { 
            
            for(int k=0;k<3;k++)
            { 
                
                
                if(a[k][l]==v)
                {
                
                    
                    r=r+1;
                    if(r==3)
                    { 
                        
                        break;
                        
                    }
                
                }
                
            }
            
           if(r==3)
         { 
                
           System.out.println("\n\nplayer 1 win");
            System.exit(0);
           break;
          
         }
            
            
        }
        
        
        
            
    
    
    }
     void player2(int v)
    {
    
       
        
        int i=s.nextInt();
        int j=s.nextInt();
        if((i>=0&&i<3)&&(j>=0&&j<3))
        {
    
        a[i][j]=v;
    
        }
        else
        { 
        
            System.out.println("Invalid postion");    
            
        }
       //to check row
        int c=0;
        for(int k=0;k<3;k++)
        { 
            
            for(int l=0;l<3;l++)
            { 
                
                
                if(a[k][l]==v)
                {
                
                    
                    c=c+1;
                    if(c==3)
                    { 
                        
                        break;
                        
                    }
                
                }
                
            }
             if(c==3)
         { 
                
           System.out.println("\n\nplayer 2 win");
            System.exit(0);
          break;
                
         }
            
    
          
            
        }
        int r=0;
         for(int l=0;l<3;l++)
        { 
            
            for(int k=0;k<3;k++)
            { 
                
                
                if(a[k][l]==v)
                {
                
                    
                    r=r+1;
                    if(r==3)
                    { 
                        
                        break;
                        
                    }
                
                }
                
            }
        if(r==3)
         { 
                
           System.out.println("\n\n player 2 win");
            System.exit(0);
           break;
                
         }
            
    
          
            
        }
        
        
        
    
    }
    
    
}

public class Main
{
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		
	    Tictic ti=new Tictic();
	    
	    ti.print();
	    int x=0;
	    while(x<9)
	    {
	    System.out.println("player 1 number:");
		int v=s.nextInt();
		
		ti.player1(v);
		
	    ti.print(); 
	  
	    
	    System.out.println("player 2 number:");
		int v2=s.nextInt();
	    
	    ti.player2(v2);
	    
	    ti.print();
	     
	      x=x+1;
	    }
	}
}



