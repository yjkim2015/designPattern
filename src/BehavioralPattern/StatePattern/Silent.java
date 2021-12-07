package BehavioralPattern.StatePattern;

public class Silent implements MobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Silent");
    }
}
