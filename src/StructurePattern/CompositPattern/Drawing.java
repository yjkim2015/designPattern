package StructurePattern.CompositPattern;

import java.util.ArrayList;
import java.util.List;

/*
Composite 객체는 Leaf 객체들을 포함하고 있으며,
Base Component를 구현할 뿐만 아니라 Leaf 그룹에 대해 add와 remove를 할 수 있는 메소드들을 클라이언트에게 제공합니다.
 */
public class Drawing implements Shape {
    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void draw(String fillColor) {
        for ( Shape oneShape : shapeList ) {
            oneShape.draw(fillColor);
        }
    }

    public void add(Shape s) {
        shapeList.add(s);
    }

    public void remove(Shape s) {
        shapeList.remove(s);
    }

    public void clear() {
        System.out.println("Clearing all the shapes form drawing");
        this.shapeList.clear();
    }
}
