package main;

public class EmpWageBuilderUC6 {
    public static final int FullDay = 2;
    public static final int HalfDay = 1;
    public static final int Wage_Per_Hr = 20;
    public static final int Max_Work_Hour=100;
    public static final int Max_Working_Day=20;

    public static void main(String[] args) {
        int workHour=0, totalWorkHour=0, totalEmpWage=0, totalWorkingDays=0;

        while (totalWorkHour <= Max_Work_Hour &&
                totalWorkingDays < Max_Working_Day) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case FullDay:
                    System.out.println("employee worked full day");
                    workHour = 8;
                    break;

                case HalfDay:
                    System.out.println("employee worked half day");
                    workHour = 4;
                    break;

                default:
                    System.out.println("employee is absent");
                    workHour = 0;
                    break;
            }
               totalWorkHour = workHour;
            System.out.println("Day#:" + totalWorkingDays + " workHour:" + totalWorkHour);
        }
         totalEmpWage = totalWorkHour * Wage_Per_Hr;
        System.out.println("Total Emp Wage:$ " + totalEmpWage);
    }
}







