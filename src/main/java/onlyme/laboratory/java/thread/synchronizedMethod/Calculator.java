package onlyme.laboratory.java.thread.synchronizedMethod;

public class Calculator {

    private int memory;

    public int getMemory() {
        return memory;
    }

    /**
     * thread safety 코드를 위한 임계 영역(critical section) 설정이 필요함
     * 1. synchronized 메소드 : 메소드의 임계영역화시켜 스레드 1개씩 처리하도록 함
     * 2. synchronized block
     */
    public synchronized void setMemory(int memory) {
        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (this) {
            //
        }

        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }
}
