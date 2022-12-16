package onlyme.laboratory.java.thread.synchronizedMethod;

public class User2 extends Thread {

    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("USER2");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(200);
    }

}
