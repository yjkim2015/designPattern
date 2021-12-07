package StructurePattern.CompositPattern;

/*
Leaf 객체들은 복합체에 포함되는 요소로, Base Component를 구현해야 합니다.
 */
public class Circle implements Shape {

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Circle with color : " + fillColor);
    }
}
