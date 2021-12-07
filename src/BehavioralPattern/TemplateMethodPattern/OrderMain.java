package BehavioralPattern.TemplateMethodPattern;

/*
템플릿 메서드 패턴이란
상위 클래스에서 처리의 흐름을 제어하며 하위 클래스에서 처리의 내용을 구체화하는 디자인 패턴이다.
공통되는 사항은 상위 추상클래스에서 구현하며, 각 객체마다 다른 부분은 하위 클래스에서 구현한다.
상속을 통한 확장 개발 방법으로 코드의 중복을 줄이고, 리팩토링(Refactoring)에 유리하여 가장 많이
사용되는 패턴 중 하나이다.
 */
public class OrderMain {
    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}
