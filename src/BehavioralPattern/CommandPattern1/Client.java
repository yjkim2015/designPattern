package BehavioralPattern.CommandPattern1;

/*
    실행될 기능을 캡슐화함으로써 주어진 여러 기능을 실행할 수 있는 재사용성이 높은 클래스를 설계하는 패턴

    커맨드 패턴은 해당 요청에 따라야하는 기능들을 캡슐화한 객체에 정리하여 실행할 수 있게 해주는 디자인 패턴이다.
    즉, 요청에 따르는 기능들이 다양하고 변경 및 추가 삭제가 많은 경우 요청이 발생되는 클래스를 변경하지 않고,
    수정할 때 매우 유용하다.

    * 커맨드 패턴이 사용되는 경우
    1. 병렬처리(Parallel Processing) : 병렬로 여러 스레드에서 실행이 되어야하는 경우
    2. 매크로(Macro) : 특정 명령에 따른 동일한 일련의 작업을 반복적으로 수행해야 하는 경우
    3. 네트워킹(Networking) : 네트워크를 통해 일련의 작업을 보내야하는 경우 (원격조작, 게임 캐릭터에 명령)


    * 커맨드 패턴 장점
    1. 기존 코드를 변경하지 않고, 새 명령을 추가할 수 있어 코드확장이 수월하다.
    2. 호출자(invoker)와 수신자(recevier)의 결합도를 낮출 수 있다.

    * 커맨드 패턴 단점
    1. 개발 명령에 대한 클래스의 수가 증가할 수 있다.
 */

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(); //receiver ConcreteCommand에서 execute 메서드를 구현할 때 필요한 클래스

        Command lampOnCommand = new LampOnCommand(lamp); //ConcreteCommand

        Alarm alarm = new Alarm(); //receiver

        Command alarmStartCommand = new AlarmStartCommand(alarm); //ConcreteCommand

        Button button1 = new Button(lampOnCommand); //Invoker
        button1.pressed();

        Button button2 = new Button(alarmStartCommand); //Invoker
        button2.pressed();

        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
