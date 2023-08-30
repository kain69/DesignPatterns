package Singleton;

public class Singleton {
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton localInstance = instance;
        if (localInstance != null) {
            return localInstance;
        }
        synchronized (Singleton.class) {
            if (localInstance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
