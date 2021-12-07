package CreationalPattern.SingletonPattern.EagerInitialization;


/*
생성 패턴은 인스턴스를 만드는 절차를 추상화하는 패턴입니다.
생성 패턴은 시스템이 어떤 Concrete Class를 사용하는지에 대한 정보를 캡슐화합니다.
생성 패턴은 이들 클래스의 인스턴스들이 어떻게 만들고 어떻게 결합하는지에 대한 부분을 완전히 가려줍니다.

싱글톤 패턴은 어떤 클래스의 인스턴스가 오직 하나임을 보장하며, 이 인스턴스에 접근할 수 있는 전역적인 접촉점을 제공하는 패턴입니다.

개발을 하다보면 어떤 클래스에 대해 단 하나의 인스턴스만을 갖도록 하는 것이 좋은 경우가 있습니다.

예를 들어, 로그를 찍는(Logging) 객체라던가 쓰레드 풀, 윈도우 관리자 등 여러 객체를 관리하는 역할의 객체는 프로그램 내에서 단 하나의 인스턴스를 갖는 것이 바람직합니다.

Eager Initialization은 가장 간단한 형태의 구현 방법입니다. 이는 싱글톤 클래스의 인스턴스를 클래스 로딩 단계에서 생성하는 방법입니다.

그러나 어플리케이션에서 해당 인스턴스를 사용하지 않더라도 인스턴스를 생성하기 때문에 자칫 낭비가 발생할 수 있습니다.


 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }

}


