package BehavioralPattern.StrategyPattern;

public class LongJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Long Jump");
    }
}
