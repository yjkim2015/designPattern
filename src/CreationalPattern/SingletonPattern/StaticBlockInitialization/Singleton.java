package CreationalPattern.SingletonPattern.StaticBlockInitialization;


/*
Eager Initialization과 유사하지만 static block을 통해서
Exception Handling에 대한 옵션을 제공합니다.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    static {
        try {
            instance = new Singleton();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occured in creating singleton instance");        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
