package CreationalPattern.SingletonPattern.BillPughSingletonImplementation;

/*
이는 Bill Pugh가 고안한 방식으로, inner static helper class를 사용하는 방식입니다.
앞선 방식이 안고 있는 문제점들을 대부분 해결한 방식으로, 현재 가장 널리 쓰이는 싱글톤 구현 방법입니다.
 */
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
