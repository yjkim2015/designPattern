package StructurePattern.BridgePattern1;

/*
추상화(abstraction)를 구현으로부터 분리하여 각각 독립적으로 변화할 수 있도록 하는 패턴
브릿지 디자인 패턴은 추상화(abstraction)와 구현(implement)이
독립적으로 다른 계층 구조를 가질 수 있고, 클라이언트 어플리케이션으로부터 구현을 숨기고 싶을 때 사용될 수 있습니다.
 */
public class BridgePatternTest {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());

        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());

        pent.applyColor();

    }
}
