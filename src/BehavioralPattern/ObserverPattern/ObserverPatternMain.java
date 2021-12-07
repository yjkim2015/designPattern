package BehavioralPattern.ObserverPattern;

/*
옵저버 패턴은 객체의 상태 변화를 관찰하는 관찰자 객체를 생성하여 사용하는 디자인 패턴이다.
즉, 객체의 변화가 발생하면 그에 따르는 종속객체들이 자동으로 변화가 통지되어 그에 따른 명령을 수행하도록 하는 일대다의 의존성을 정의한다.
    옵저버 패턴을 사용하는 경우
- 분산 이벤트 핸들링 시스템
- 이벤트 기반 프로그래밍
    옵저버 패턴 장점
- 객체간의 결합도가 느슨해진다.
- 실시간으로 효과적으로 데이터를 배분할 수 있다.

 */
public class ObserverPatternMain {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        NewSubscriber newsSubscriber1 = new NewSubscriber("옵저버1", newsPublisher);
        NewSubscriber newsSubscriber2 = new NewSubscriber("옵저버2", newsPublisher);

        newsPublisher.setNews("특보", "옵저버 패턴이 만들어졌습니다.");
        newsPublisher.setNews("정정", "옵저버 패턴으로 내용이 정정됨을 알립니다. ");
        newsPublisher.removeObserver(newsSubscriber1);
        newsPublisher.setNews("속보","누군가 구독 해제를 했습니다.");
    }
}
