package StructurePattern.BridgePattern1;

public class Triangle extends Shape {

    Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color");
        color.applyColor();
    }
}
