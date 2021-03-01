package creative_mode.singleton.thread_safe;

/**
 * Synchronized实现延迟加载线程安全单例
 */
public class SynchronizedSingleton {

    // The field must be declared volatile so that double check lock would work
    // correctly.
    private static volatile SynchronizedSingleton instance;

    public String value;

    private SynchronizedSingleton(String value) {
        this.value = value;
    }

    public static SynchronizedSingleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue
        SynchronizedSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (SynchronizedSingleton.class) {
            if (instance == null) {
                instance = new SynchronizedSingleton(value);
            }
            return instance;
        }
    }
}
