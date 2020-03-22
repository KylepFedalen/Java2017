
public class LoopPrint
{
    
    public LoopPrint()
    {
        for(int i = 10; i > 1; i--){
            if(i > 0){
                System.out.print(i + ", ");
            }
        }
        System.out.print(1 + " Blast off!");
    }
    public static void main()
    {
       new LoopPrint();
    }
}
