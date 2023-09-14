import java.util.*;
public class Baseball_game {
    public static void main(String[] args) {
        String ops[]={"5","2","C","D","+"};
        ArrayList<String> ar=new ArrayList<>();
        for(int i=0;i<ops.length;i++)
        {
            
            if(Character.isDigit(ops[i].charAt(0)))
            {
                ar.add(ops[i]);
            }
            else if(ops[i].charAt(0)=='C')
            {
                ar.remove(ar.size()-1);
            }
            else if(ops[i].charAt(0)=='D')
            {
                int a=Integer.parseInt(ar.get(ar.size()-1))*2;
                ar.add(String.valueOf(a));
            }
            else if(ops[i].charAt(0)=='+')
            {
                int sum=0;
                for(int j=0;j<ar.size();j++)
                {
                    sum=sum+(Integer.parseInt(ar.get(j)));
                }
                ar.add(String.valueOf(sum));
            }   
        }
        System.out.println(ar);
        int sum=0;
        for(int i=0;i<ar.size();i++)
        {
            sum=sum+(Integer.parseInt(ar.get(i)));
        }
        System.out.println("Total: "+sum);
    }
}
