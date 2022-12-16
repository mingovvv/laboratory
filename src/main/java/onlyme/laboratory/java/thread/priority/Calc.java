package onlyme.laboratory.java.thread.priority;

class Calc extends Thread {

    public Calc(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2_000_000_000; i++) {}
        System.out.println(getName());
    }

}
