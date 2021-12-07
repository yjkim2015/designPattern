package BehavioralPattern.StatePattern;

public class AlertStateContext {
    private MobileAlertState currentState;

    public AlertStateContext() {
        this.currentState = new Vibration();
    }

    public void setState(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    public void alert() {
        currentState.alert(this);
    }
}
