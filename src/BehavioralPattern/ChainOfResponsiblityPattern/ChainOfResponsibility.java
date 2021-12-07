package BehavioralPattern.ChainOfResponsiblityPattern;


/*
클라이언트 요청을 처리할 수 있는 처리객체를 집합(Chain)으로 만들어 부여함으로 결합을 느슨하기 위해
만들어진 디자인 패턴이다. 실제로 굉장히 많이 쓰이는 패턴 중 하나로 여러 개의 객체 중에서 어떤 것이 요구를
처리할 수 있는 지 사전에 알 수 없을 때 사용된다. 요청 처리가 들어오게 되면 그것을 수신하는 객체가 자신이
처리 할 수 없는 경우에는 다음 객체에게 문제를 넘김으로써 최종적으로 요청을 처리 할 수 있는 객체에 의해 처리가 가능하도록 하는 패턴이다.

책임연쇄 패턴이 적용되는 경우
1. 요청의 발신자와 수신자를 분리하는 경우
2. 요청을 처리할 수 있는 객체가 여러개 일 떄 그 중 하나에 요청을 보내려는 경우
3. 코드에서 처리객체(handler)를 명시적으로 지정하고 싶지 않은 경우

 즉, 책임 연쇄 패턴은 요청을 처리할 수 있는 객체가 여러 개이고 처리객체가 특정적이지 않을 경우 권장되는 패턴이다.

 장점
 1. 결합도를 낮추며, 요청의 발신자와 수신자를 분리시킬 수 있다.
 2. 클라이언트는 처리객체의 집합 내부의 구조를 알 필요가 없다.
 3. 집합 내의 처리 순서를 변경하거나 처리객체를 추가 또는 삭제할 수 있어 유연성이 향상된다.
 4. 새로운 요청에 대한 처리객체 생성이 매우 편리하다.

 단점
 1. 충분한 디버깅을 거치지 않았을 경우 집합 내부에서 사이클이 발생할 수 있다.
 2. 디버깅 및 테스트가 쉽지 않다.
 */
public class ChainOfResponsibility {

    public static void main(String[] args) {
        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();

        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Number(90));
        c1.process(new Number(-50));
        c1.process(new Number(0));
        c1.process(new Number(91));

    }

}
