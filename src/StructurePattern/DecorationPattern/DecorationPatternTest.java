package StructurePattern.DecorationPattern;

/*
데코레이터 패턴은 상속(Inheritance)과 합성(Composition)을 사용하여 객체에 동적으로 책임을 추가할 수 있게 합니다.
이 방법은 서브 클래스를 생성하는 것보다 유연한 방법을 제공합니다.
데코레이터 패턴은 런타임에서 유연하게 객체의 기능들을 수정하고 조합하는데 유용하게 사용되는 패턴입니다.
 */
public class DecorationPatternTest {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());

        sportsCar.assemble();

        System.out.println("\n********");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));

        sportsLuxuryCar.assemble();

    }
}
