package main;

public class EmpWageBuilderUC5 {
    public static final int fullDay = 2;
    public static final int halfDay = 1;
    public static final int Wage_Per_Hr = 20;
    public static final int total_Working_Day=20;

    public static void main(String[] args) {
        int totalWage;
        int empCheck = (int)Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case fullDay:
                System.out.println("employee worked full day");
                int fullDayWorkHour = 16;
                totalWage = (fullDayWorkHour * Wage_Per_Hr * total_Working_Day);
                System.out.println("Monthly total wage is : $" + totalWage);
                break;
            case halfDay:
                System.out.println("employee worked half day");
                int HalfDayWorkHour = 8;
                totalWage = (HalfDayWorkHour * Wage_Per_Hr * total_Working_Day);
                System.out.println("Monthly total wage is : $" + totalWage);
                break;
            default:
                System.out.println("employee is absent");
                int Wage = 0;
                System.out.println("monthly total wage is : $" + Wage);
                break;

        }
    }

}
