package BehavioralPattern.StrategyPattern;

public class TornadoKick implements KickBehavior {
    @Override
    public void kick() {
        System.out.println("Tornado kick");
    }
}
