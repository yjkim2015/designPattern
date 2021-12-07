package BehavioralPattern.StatePattern;

public class Vibration implements MobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("Vibration");
    }
}
