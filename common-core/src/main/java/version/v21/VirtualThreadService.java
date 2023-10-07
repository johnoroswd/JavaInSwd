package version.v21;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class VirtualThreadService {
    int num=0;
    private final Object lock =new Object();
    public void method1(){

        Thread.startVirtualThread(()->{
            synchronized (lock){
                num ++ ;
            }
        });
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(num);
    }
}
