package CreationalPattern.FactoryPattern;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    public static Computer getComputer(HardWare type, String ram, String hdd, String cpu) {
        if ( HardWare.PC == type ) {
            return new PC(ram, hdd, cpu);
        }
        else if ( HardWare.Server == type ) {
            return new Server(ram, hdd, cpu);
        }

        return null;
    }
}
