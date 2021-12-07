package StructurePattern.CompositPattern;

/**
 * Base Component - 베이스 컴포넌트는 클라이언트가 composition 내의 오브젝트들을 다루기 위해 제공되는 인터페이스를 말합니다.
 * 베이스 컴포넌트는 인터페이스 또는 추상 클래스로 정의되며 모든 오브젝트들에게 공통되는 메소드를 정의해야 합니다.
 */
public interface Shape {
    public void draw(String fillColor);
}
