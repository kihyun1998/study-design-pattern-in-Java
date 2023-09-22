package Example;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler uniqe;
    //or
    //private static ChocolateBoiler uniqe = new ChocolateBoiler();



    /*
    1. synchronized를 getIntance하는 함수에 추가해서 멀티쓰레드 시 이중 생성 방지
    2. 애초에 instance를 생성해서 하나의 객체만 사용하도록 함
    3. volatitle을 사용 한 후 객체 생성 시 동기화를 사용함으로 해결
    4. 대빵은 enum을 이용하는 것

    */

    // 생성자
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    // synchronized를 추가하여 멀티 쓰레드 시 인스턴스를 2개 이상 만드는 버그 해결할 수 있다.
    public static ChocolateBoiler getUnique(){
        if(uniqe == null){
            synchronized (ChocolateBoiler.class){
                if(uniqe==null){
                    uniqe = new ChocolateBoiler();
                }
            }
        }
        return uniqe;
        // 위 주석처럼 생성자 변경하면 return uniqe만 하면 된다.
    }


    // 재료는 비어있을 때만 넣기
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    // 다 끓이면 보일러 비우기
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty=true;
        }
    }

    // 비어있지 않고 끓지 않았으면 끓기
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}
