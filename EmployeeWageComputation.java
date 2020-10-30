import java.util.Random;

public class EmpWageComp {
    public static void main(String[] args){
   
        int wagePerHour=20;
        int fullDayHours=8;
        int halfDayHours=4;
        int workingDays=20;
        int totalWorkingHours=0;

        for (int i=0; i<workingDays; i++) {
      
            Random ran = new Random();
            int ran1 = ran.nextInt(3);

        
            if (ran1 == 0) {
                totalWorkingHours += fullDayHours;
            } else if (ran1 == 1) {
                totalWorkingHours += halfDayHours;
            } else {
                totalWorkingHours += 0;
            }
        
            if (totalWorkingHours > 100) {
                totalWorkingHours = 100;
                break;
            }
        }
     
        int totalMonthlyWage=totalWorkingHours * wagePerHour;
        System.out.println("Total Working Hours : " + totalWorkingHours );
        System.out.println("Total Wage : " + totalMonthlyWage);
    }
}

