import java.util.* ;

public class LeapYear {
    public static boolean leapYear(int year){
        boolean x = (year%4 == 0) ;
        boolean y = (year%100 != 0) ;
        boolean z = (year%400 == 0) ;
        if(x && (y || z)) {
            return true;
        }
        else{
            return false;
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        if(leapYear(year) == true){
            System.out.println(year + " is a leap year!");
        }
        else{
            System.out.println(year + " is not a leap year!");
        }
    }
}
