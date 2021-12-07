package BehavioralPattern.StrategyPattern;

public class Kim extends Fighter{

    public Kim(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
        super(kickBehavior, jumpBehavior);
    }

    @Override
    public void display() {
        System.out.println("KIM");
    }
}
