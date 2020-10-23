package thread.lock;

/**
 * @program: basicTest
 * @description: 显示定义同步锁对象来实现同步，Lock对象
 * @author: 全栈者也
 * @create: 2020 - 10 - 23 13:34
 **/
public class LockUse {

    /**
     *
     * 从JDK5.0开始，Java提供了更强大的线程同步机制——通过显式定义同步锁对
     *  象来实现同步。同步锁使用Lock对象充当
     *
     * java.util.concurrent.locks.Lock接口是控制多个线程对共享资源进行访问的工具。
     * 锁提供了对共享资源的独占访向，每次只能有一个线程对Lock对象加锁，线程开
     * 始访问共享资源之前应先获得Lock对象
     *
     * ReentrantLock类实现了Lock，它拥有与synchronized相同的并发性和内存语
     * 义，在实现线程安全的控制中，比较常用的是ReentrantLock，可以显式加锁、释放锁。
     *
     *
     * synchronized 和 lock 的对比
     *       Lock是显式锁（手动开启和关闭锁，别忘记关闭锁)synchronized是隐式锁，出了作用域自动释放
     *       Lock只有代码块锁，synchronized有代码块锁和方法锁
     *       使用Lock锁，JVM将花费较少的时间来调度线程，性能更好。并且具有更好的扩展性（提供更多的子类)
     *      优先使用顺序:
     *      Lock >同步代码块（已经进入了方法体，分配了相应资源)>同步方法（在 方法体之外)
     */

}
