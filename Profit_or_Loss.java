import java.util.Scanner;
public class porl
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int sp = s.nextInt();
        int cp = s.nextInt();
        if(sp < cp)
        System.out.println("Profit");
        else if(sp > cp)
        System.out.println("Loss");
        else
        System.out.println("No Profit and No Loss");
        
        
    }
    
}