package Example;

public class ClassicSingleton {
    private static ClassicSingleton unique;

    private ClassicSingleton(){}

    // 이렇게 작성하면 이 코드가 들어 있는 한 uniqe 객체는 모두 동일한 값을 가짐;
    public static ClassicSingleton getInstance(){
        if(unique==null){
            unique = new ClassicSingleton();
        }
        return unique;
    }
}
