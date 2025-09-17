package Statment;

public class IfElseCondi {

    public static void main(String[] args) {
        int age = 45;
        int weight = 65;

        if(age > 18) {
            if(weight > 60) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible (weight issue)");
            }
        } else {
            System.out.println("Age is not greater than 18");
        }

        System.out.println("Program ended");
    }
}
