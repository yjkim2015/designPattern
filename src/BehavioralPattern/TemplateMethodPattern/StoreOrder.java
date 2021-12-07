package BehavioralPattern.TemplateMethodPattern;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("Do Select : Customer chooses the item from shelf. ");
    }

    @Override
    public void doPayment() {
        System.out.println("Do Payment : Pays at counter through cash/POS");
    }

    @Override
    public void doDelivery() {
        System.out.println("Do Delivery : Item delivered to in delivery counter");
    }
}
