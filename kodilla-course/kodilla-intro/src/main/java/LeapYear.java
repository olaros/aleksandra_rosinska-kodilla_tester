public class LeapYear {
    private static boolean leapYear(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int year = 1997;
        System.out.println("Rok " + year + " " + leapYear(year) + " przestępny!!!");
    }
}
