import java.util.ArrayList;
public class PrintArray
{
    
    public static void main()
    {
        ArrayList<String> cityList = new ArrayList<String>();
        cityList.add("London");
        cityList.add("New York");
        cityList.add("Paris");
        cityList.add("Toronto");
        cityList.add("Hong Kong");
        cityList.add("Singapore");
 
        System.out.print(cityList.size());
        System.out.print(" " + cityList.contains("Toronto"));
        System.out.print(" " + cityList.indexOf("New York"));
        System.out.println(" " +  cityList.isEmpty());
    }
        
    

    
}
