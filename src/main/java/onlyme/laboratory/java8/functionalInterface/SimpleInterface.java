package onlyme.laboratory.java8.functionalInterface;

@FunctionalInterface // Java에서 제공해주는 애노테이션. 함수형 인터페이스인지 컴파일시점에 검증해준다.
public interface SimpleInterface {

    // 인터페이스 안에 추상 메서드가 딱 하나만 있으면 '함수형 인터페이스' 라고 부름
    // abstract 키워드 생략 가능
    void doIt();


    // 추상 메서드 아님
    default void eat() {
        System.out.println("냠냠");
    }


    // 추상 메서드 아님
    static void eatAgain() {
        System.out.println("또 냠냠");
    }

}
