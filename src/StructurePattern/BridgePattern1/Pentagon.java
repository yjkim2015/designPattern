package StructurePattern.BridgePattern1;

public class Pentagon extends Shape {

    Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon filled with color");
        color.applyColor();
    }
}
