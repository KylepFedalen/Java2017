import java.util.Scanner;
public class AddIntAndFloat
{
    Scanner in = new Scanner(System.in);
    
    public AddIntAndFloat()
    {
        System.out.print("input int >>");
        int varx = in.nextInt();
        System.out.print("input float >>");
        float vary = in.nextInt();
        System.out.println("sum >>" + (varx + vary));
    }

    public static void main()
    {
        new AddIntAndFloat();
    }
}
