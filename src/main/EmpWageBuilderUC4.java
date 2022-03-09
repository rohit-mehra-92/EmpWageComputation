package main;

public class EmpWageBuilderUC4 {
    public static void main(String[] args) {

        int fullDay = 2;
        int halfDay = 1;
        int absent = 0;
        int WagePerHr = 20;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        switch (empCheck){
        case fullDay:
                System.out.println("employee worked full day");
                int workHour = 16;
                int totalWage;
                totalWage = (workHour * WagePerHr);
                System.out.println("total wage is :$" + totalWage);

            case halfDay:
                System.out.println("employee worked half day");
                int workHour = 8;
                int totalWage;
                totalWage = (workHour * WagePerHr);
                System.out.println("total wage is $:" + totalWage);

            case absent:
                System.out.println("employee is absent");
                int Wage = 0;
                System.out.println("Total wage is : $" + Wage);
                break;

            }
        }

    }
