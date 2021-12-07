package CreationalPattern.AbstractFactoryPattern;

/*

팩토리 메소드 패턴에서는 하나의 팩토리 클래스가 인풋으로 들어오는 값에 따라 if-else나 switch 문을 사용하여 다양한 서브클래스를 리턴하는 형식으로 구현했었습니다.

추상 팩토리 패턴은 구현(Implements)보다 인터페이스(Interface)를 위한 코드 접근법을 제공합니다.
위 예에서 getComputer() 메소드는 파라미터로 인터페이스를 받아 처리를 하기 때문에 getComputer() 에서 구현할 것이 복잡하지 않습니다.

추상 팩토리 패턴은 추후에 sub class를 확장하는 데 있어 굉장히 쉽게할 수 있습니다.
위 예에서 만약 Laptop 클래스를 추가하고자 한다면 getComputer()의 수정 없이 LaptopFactory만 작성해주면 됩니다.
이러한 특징에 기반하여 추상 팩토리 패턴은 "Factory of Factories"라고도 불립니다.
추상 팩토리 패턴은 팩토리 패턴(팩토리 메소드 패턴)의 조건문(if-else, switch 등)으로부터 벗어납니다.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1TB", "2.9 Ghz"));
        System.out.println("AbstractFactory PC Config :: " + pc);
        System.out.println("AbstractFactory Server Config :: " + server);
    }

}
