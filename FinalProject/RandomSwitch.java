import java.util.Random;
public class RandomSwitch
{
    Random rand = new Random();
    public RandomSwitch()
    {
       int max = 10;
       int min = 1;
       int randomInt = rand.nextInt(max - min + 1) + min;
       System.out.println("random int >> "+randomInt);
       switch(randomInt)
       {
           case 1:System.out.println("one is fun");
                break;
           case 2:System.out.println("two is blue");
                break;
           case 3:System.out.println("if three, then flee");
                break;
           case 4:System.out.println("at four, knock on the door");
                break;
           case 5:System.out.println("for five, look alive");
                break;
           case 6:System.out.println("after six, pick up som sticks");
                break;
           case 7:System.out.println("done with seven, turn it up to eleven");
                break;
           case 8:System.out.println("while eight, sit up straight");
                break;
           case 9:System.out.println("when nine, feeling fine");
                break;
           case 10:System.out.println("ends with ten, do it again");
                break;
        }
    }

    public static void main()
    {
       new RandomSwitch();
    }
}
