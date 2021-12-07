package BehavioralPattern.StrategyPattern;

/*
행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴으로
같은 문제를 해결하는 여러 알고리즘이 클래스별로 캡슐화 되어 있고
이들이 필요할 때 교체할 수 있도록 함으로써 동일한 문제를 다른 알고리즘으로
해결할 수 있게 하는 디자인 패턴이다.
즉, 전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴이다.
 */
public class FighterMain {
    public static void main(String[] args) {
        JumpBehavior shortJump      = new ShortJump();
        JumpBehavior LongJump       = new LongJump();
        KickBehavior tornadoKick    = new TornadoKick();

        Fighter kim = new Kim(tornadoKick, shortJump);
        kim.display();
        kim.jump();

        kim.punch();
        kim.kick();
        kim.punch();;

        kim.setJumpBehavior(LongJump);
        kim.jump();
    }
}
