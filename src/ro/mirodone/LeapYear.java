package ro.mirodone;

public class LeapYear {

    public void checkYear ( int year) {

        boolean x = (year % 4) == 0; // is year divisible by 4 > NO > not a leap year
        boolean y = (year % 100) != 0;// is year divisible by 100 > NO >  leap year
        boolean z = ((year % 100 == 0) && (year % 400 == 0));// is year divisible by 400 > NO > not a leap year

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }

    }

}
