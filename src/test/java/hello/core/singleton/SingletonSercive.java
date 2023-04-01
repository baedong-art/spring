package hello.core.singleton;

public class SingletonSercive {

    private static final SingletonSercive instance = new SingletonSercive();

    public static SingletonSercive getInstance(){
        return instance;
    }

    private SingletonSercive() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
