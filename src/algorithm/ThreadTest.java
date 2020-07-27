package algorithm;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadTest{
    public static void main(String[] args) {

        LinkedBlockingQueue lbq = new LinkedBlockingQueue(50);
        new prothread(lbq,1).start();
        new prothread(lbq,2).start();
        new prothread(lbq,3).start();
        new custhread(lbq).start();
    }
}

class prothread extends Thread{

    LinkedBlockingQueue lbq;
    private int num;

    public prothread(LinkedBlockingQueue lbq, int num){
        this.lbq = lbq;
        this.num = num;
    }
    public void run(){
        try{
            while(true){
                if(lbq.size() < 50){
                    System.out.println(num + "Thread 실행 중");
                    lbq.put((int)(Math.random()*100));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class custhread extends Thread{
    LinkedBlockingQueue lbq;
    private static int sum = 0;

    public custhread(LinkedBlockingQueue lbq){
        this.lbq = lbq;
    }
    public void run(){
        try{
            while (true) {
                if (!lbq.isEmpty()) {
                    Thread.sleep(1000);
                    sum += (Integer) lbq.remove();
                    System.out.println("sum : " + sum);
                }else{
                    System.out.println("empty!!");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}