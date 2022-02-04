
package thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceInvokeAll {

   public static void main(String[] args) throws Exception {

       ExecutorService executor = Executors.newFixedThreadPool(10);

       Collection<Callable<String>> callables = new ArrayList<>();
       callables.add(() -> doLongWork("hi! 1"));
       callables.add(() -> doLongWork("hi! 2"));

       List<Future<String>> result = executor.invokeAll(callables);

       for (Future f : result) {
           System.out.println("f.isDone :  " + f.isDone() + " f.get : " + f.get());
       }
       String oneResult = executor.invokeAny(callables);

       System.out.println("invokeAny: "+oneResult);
       executor.shutdown();

   }

   private static String doLongWork(String msg) {
       System.out.println("Running " + msg);
       try {
           Thread.sleep(1000l);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       return "finish " + msg;
   }

}
