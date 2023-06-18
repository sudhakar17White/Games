import java.util.*;
class Sudoku
{
    static void display(int mat[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("\n");
        }

    }
    

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //9x9 matrixs
        int mat[][]=new int[9][9];
        System.out.println("set the random place number with zero for table");
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                mat[i][j]=s.nextInt();
            }

        }
        display(mat);
     
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {

                if(mat[i][j]==0)
                {
                    
                  int val=s.nextInt();
                  for(int k=0;k<9;k++)
                  {
                    if(mat[i][k]!=val)
                    {
                        for(int l=0;l<9;l++)
                        {
                            if(mat[l][j]!=val)
                            {
                                mat[i][j]=val;
                               
                            }
                            
                        }
                    }
                    
                  }
                }
                   

                
               
            }

        }
          System.out.println("Sudoku");
            display(mat);
       



    }

}