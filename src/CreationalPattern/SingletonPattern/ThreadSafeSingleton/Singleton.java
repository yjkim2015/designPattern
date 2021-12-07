package CreationalPattern.SingletonPattern.ThreadSafeSingleton;

/**
 * Thread Safe Singleton은 멀티 쓰레드 환경에서 동기화를 보장 받지만,
 * syncronized 키워드 자체에 대한 비용이 크기 때문에 싱글톤 인스턴스 호출이 잦은 어플리케이션에서는
 * 성능이 떨어지게 된다.
 *
 * 그래서 고안된 방식이 double checked locking이다.
 * 이는 instance가 null 일 경우에만 synchronized가 동작하도록 한다.
 *
 * public static EagerSingleton getInstance() {
 *     syncronized(EagerSingleton.class){
 *         if ( instance == null ) {
 *             instance = new Singletone();
 *         }
 *     }
 *     return instance;
 * }
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static synchronized  Singleton getInstance() {
        if ( instance == null ) {
            instance = new Singleton();
        }
        return instance;
    }
}
