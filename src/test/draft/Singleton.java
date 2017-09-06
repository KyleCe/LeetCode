package test.draft;

public class Singleton {
    private Singleton mSingleton;

    private Singleton() {
    }

    public Singleton getInsatnce() {
        if (mSingleton == null) {
            synchronized (this) {
                if (mSingleton == null) {
                    mSingleton = new Singleton();
                }
            }
        }
        return mSingleton;
    }
}
