package Session23rdMarch;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2024;

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }

        public static boolean isLeapYear(int year)
        {
            if(year % 400 == 0)
            {
                return true;
            } else if (year % 4 ==0 && year !=100)
            {
                return true;
            } else {
                return false;
            }
        }

}
