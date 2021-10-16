package onlyme.laboratory.java8.functionalInterface.methodReference;

public class Hello {

    private String name;

    // 기본 생성자
    public Hello() {
    }

    // 생성자
    public Hello(String name) {
        this.name = name;
    }

    // 인스턴스 메소드
    public String politeSpeech(String name) {
        return name + "님, 안녕하세요";
    }

    // 스태틷 메소드
    public static String informalSpeech(String name) {
        return name + ", 안녕?";
    }

}
