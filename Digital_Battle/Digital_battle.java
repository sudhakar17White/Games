package Games.Digital_Battle;

import java.util.Scanner;

/**
 * Digital_battle
 */
public class Digital_battle {

    public static int greater(int num)
    {
        int a,b;
        a=num%10;
        num=num/10;
        b=num%10;
        if(a>b)
        {
           return a;
        }
        else if(a==b)
        {
            return 0;
        }
        else
        {
            return b;
        }

       
    }

    public static void Digit_bat(String word,int len)
    {
        if(len%2!=0)
        {
            len=len-1;
            char la=word.charAt(len);
            word=word.substring(0, len);
            int x=0,y=1;
            String n="";
            for(int i=0;i<len/2;i++)
            {
                  String a=""+word.charAt(x)+word.charAt(y);
                  x+=2;y+=2;
                  int ans=greater(Integer.parseInt(a));
                  if(ans!=0)
                  {
                    n=n+String.valueOf(ans);
                  }
            }
            System.out.println(n+la);
        }
        else
        {
            int x=0,y=1;
            String n="";
            for(int i=0;i<len/2;i++)
            {
                  String a=""+word.charAt(x)+word.charAt(y);
                  x+=2;y+=2;
                  int ans=greater(Integer.parseInt(a));
                  if(ans!=0)
                  {
                    n=n+String.valueOf(ans);
                  }
            }
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        String num=s.nextLine();
        int len=num.length();
        Digit_bat(num,len);
        
    }
    
}