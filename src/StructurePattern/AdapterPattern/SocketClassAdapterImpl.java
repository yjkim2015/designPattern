package StructurePattern.AdapterPattern;

//ClassAdapter 자바의 상속을 이용한 방법
//어댑터 패턴은 클래스의 인터페이스를 사용자가 기대하는 인터페이스 형태로 변환시키는 패턴입니다.
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
