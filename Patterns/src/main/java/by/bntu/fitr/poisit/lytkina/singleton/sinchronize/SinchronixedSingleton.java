package by.bntu.fitr.poisit.lytkina.singleton.sinchronize;

public final class SinchronixedSingleton {
    private static SinchronixedSingleton instance;

    private SinchronixedSingleton() {
    }
    public static synchronized SinchronixedSingleton getInstance(){
        if (instance == null){
            synchronized (SinchronixedSingleton.class){
                if (instance == null){
                    instance = new SinchronixedSingleton();
                }
            }
        }
        return instance;
    }

}
