import java.util.Date;
import java.util.Scanner;


public class exercise6 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your current age?");
        String age = input.next();
        int convAge = Integer.parseInt(age);

        Scanner input2 = new Scanner (System.in);
        System.out.println("At what age would you like to retire?");
        String retirementAge = input2.next();
        int convRAge = Integer.parseInt(retirementAge);

        int numYears = convRAge - convAge;

        Date d=new Date();
        int currYear=d.getYear();
        currYear+=1900;
        
        int retireYear = currYear + numYears;

        System.out.println("You have "+numYears+" years left until you can retire." );
        System.out.println("It's "+ currYear+", so you can retire in "+retireYear);


    }
}
