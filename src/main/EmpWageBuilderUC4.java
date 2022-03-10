package main;

public class EmpWageBuilderUC4 {
    public static final int fullDay = 2;
    public static final int halfDay = 1;
    public static final int WagePerHr = 20;

    public static void main(String[] args) {
        int totalWage;
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case fullDay:
                System.out.println("employee worked full day");
                int fullDayWorkHour = 16;
                totalWage = (fullDayWorkHour * WagePerHr);
                System.out.println("total wage is : $" + totalWage);
                break;
            case halfDay:
                System.out.println("employee worked half day");
                int HalfDayWorkHour = 8;
                totalWage = (HalfDayWorkHour * WagePerHr);
                System.out.println("total wage is : $" + totalWage);
                break;
            default:
                System.out.println("employee is absent");
                int Wage = 0;
                System.out.println("Total wage is : $" + Wage);
                break;

        }
    }

}
