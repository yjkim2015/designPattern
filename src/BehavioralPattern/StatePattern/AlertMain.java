package BehavioralPattern.StatePattern;

public class AlertMain {
    public static void main(String[] args) {
        AlertStateContext stateContext = new AlertStateContext();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
    }
}
