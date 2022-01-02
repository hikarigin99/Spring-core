package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}   // private로 접근 제한하여 외부에서 new 생성하는 것을 막음

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
