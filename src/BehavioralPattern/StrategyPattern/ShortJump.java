package BehavioralPattern.StrategyPattern;

public class ShortJump implements JumpBehavior {
    @Override
    public void jump() {
        System.out.println("Short Jump");
    }
}
