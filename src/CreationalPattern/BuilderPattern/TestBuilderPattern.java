package CreationalPattern.BuilderPattern;

/*
빌더 패턴이란 복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴이다
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(String.format("HDD {%s} RAM {%s} isGraphicsCardEnabled {%s} isBluetoothEnabled {%s}"
                ,comp.getHDD(), comp.getRAM(), comp.isGraphicCardEnabled(), comp.isGraphicCardEnabled()));
    }
}
