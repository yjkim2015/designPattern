package StructurePattern.AdapterPattern;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
