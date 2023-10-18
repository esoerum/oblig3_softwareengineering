package no.hiof.espeso;

public class Main {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                }
                else return false;
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}