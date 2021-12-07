package StructurePattern.FlyweightPattern;

import java.util.HashMap;

/*
디자인 패턴의 교과서인 GoF에서는 플라이웨이트 패턴에 대해 다음과 같이 정의하고 있습니다.

'공유(Sharing)'를 통하여 대량의 객체들을 효과적으로 지원하는 방법

이처럼 플라이웨이트 패턴은 많은 수의 객체를 생성해야 할 때 주로 쓰입니다.

쉽게 말하면 캐시된 데이터 사용하는거 같은데?
 */


/*
플라이웨이트 패턴은 어디에서 쓰이고 있을까요?

자바의 모든 래퍼 클래스의 valueOf() 메소드가 바로 이 플라이웨이트 패턴을 사용하고 있습니다.
그래서 래퍼 클래스를 생성해야 할 때 new 키워드를 통해 인스턴스를 매번 생성하기보다는 valueOf() 메소드를 통해 생성하는 것이 더 효율적입니다.


또, 대표적으로 사용되는 것이 바로 Java의 String Pool 입니다.
Java에서는 String Pool을 별도로 두어 같은 문자열에 대해 다시 사용될 때에 새로운 메모리를 할당하는 것이 아니라
tring Pool에 있는지 검사해서 있으면 가져오고 없으면 새로 메모리를 할당하여 String Pool에 등록한 후에 사용하도록 하고 있습니다.
 */
public class ShapeFactory {
    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();
    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
        if ( shapeImpl == null ) {
            if ( type.equals(ShapeType.OVAL_FILL) ) {
                shapeImpl = new Oval(true);
            }
            else if ( type.equals(ShapeType.OVAL_NOFILL) ) {
                shapeImpl = new Oval(false);
            }
            else if ( type.equals(ShapeType.LINE) ) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }


    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
