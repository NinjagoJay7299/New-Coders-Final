package main.java;

public class Main {
    public static void main(String[] args) {
        Logic logicPuzzle = new Logic();
        System.out.println("Logic Test: " + logicPuzzle.checkCorrect());
    
        ForLoop forloop = new ForLoop();
        forloop.forLoop();
        System.out.println("For Loop Test: " + forloop.checkCorrect());

        SwitchTest switchtest = new SwitchTest();
        System.out.println("Switch Test: " + switchtest.checkCorrect());

        IfTest test = new IfTest();
        test.test();
    }
}
