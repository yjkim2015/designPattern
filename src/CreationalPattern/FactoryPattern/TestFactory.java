package CreationalPattern.FactoryPattern;

/*
팩토리 패턴은 객체를 생성하는 인터페이스는 미리 정의하되, 인스턴스를 만들 클래스의 결정은 서브 클래스 쪽에서 내리는 패턴입니다.
다시 말해 여러 개의 서브 클래스를 가진 슈퍼 클래스가 있을 때 인풋에 따라 하나의 자식 클래스의 인스턴스를 리턴해주는 방식입니다.

Factory class를 Singleton으로 구현해도 되고, 서브클래스를 리턴하는 static 메소드로 구현해도 됩니다.
팩토리 메소드는 위 예제의 getComputer()와 같이 입력된 파라미터에 따라 다른 서브 클래스의 인스턴스를 생성하고 리턴합니다.

팩토리 패턴은 클라이언트 코드로부터 서브 클래스의 인스턴스화를 제거하여 서로 간의 종속성을 낮추고, 결합도를 느슨하게 하며(Loosely Coupled), 확장을 쉽게 합니다.
예를 들어, 위 예제에서 작성한 클래스 중 PC class에 대해 수정 혹은 삭제가 일어나더라도 클라이언트는 알 수 없기 때문에 코드를 변경할 필요도 없습니다.
팩토리 패턴은 클라이언트와 구현 객체들 사이에 추상화를 제공합니다.

java.util 패키지에 있는 Calendar, ResourceBundle, NumberFormat 등의 클래스에서 정의된 getInstance() 메소드가 팩토리 패턴을 사용하고 있습니다.
Boolean, Integer, Long 등 Wrapper class 안에 정의된 valueOf() 메소드 또한 팩토리 패턴을 사용했습니다.
 */
public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(HardWare.PC, "2 GB", "500 GB", "2.4 Ghz");

        Computer server = ComputerFactory.getComputer(HardWare.Server, "2 GB", "500 GB", "2.4 Ghz");

        System.out.println("Factory PC Config : " + pc);
        System.out.println("Factory Server Config : " + server);

    }
}
