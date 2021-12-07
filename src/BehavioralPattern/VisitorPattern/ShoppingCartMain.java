package BehavioralPattern.VisitorPattern;

/*
방문자 패턴이란
실제 로직을 가지고있는 객체(Visitor)가 로직을 적용할 객체(Elemenet)를 방문하면서 실행하는 패턴이다.
즉, 로직과 구조를 분리하는 패턴이라고 볼 수 있다.
로직과 구조가 분리되면 구조를 수정하지 않고도 새로운 동작을 기존 객체 구조에 추가할 수 있다.
 */
public class ShoppingCartMain {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book(20, "What is Justice?"),
                new Book(100, "DesignPattern"),
                new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")
        };

        int total = calculatePrice(items);

        System.out.println("Total Cost = " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        int sum = 0;

        for ( ItemElement item : items ) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
