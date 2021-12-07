package CreationalPattern.SingletonPattern.LazyInitailization;


/**
 * Lazy Initialization의 방법은 멀티 쓰레드 환경에서 동기화 문제가 발생한다.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if ( instance == null ) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
