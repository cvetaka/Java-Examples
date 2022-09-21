package IfEleseIf;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int points = 65;
        if (points < 50){
            System.out.println("fail");
        }
        else if (points >= 50 && points < 60){
            System.out.println(" D grade");
        }
        else if (points >= 60 && points < 70){
            System.out.println(" C garade");
        }
        else if (points >= 70 && points <80){
            System.out.println(" B grade");
        }
        else if (points >= 80 && points < 90){
            System.out.println(" A garade");
        }
        else if (points >= 90 && points <100){
            System.out.println(" A+ grade");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
