package onlyme.laboratory.java8.Interface;

/**
 *  JAVA8에 추가된 기본 메소드(default method)와 스태틱 메소드(static method)
 */
public interface TestInterface {

    // 기본에 구현를 강제한 메소드
    void printName();

    // 만약 훗 날 메소드를 추가로 코딩하면 인터페이스를 구현한 클래스에서 해당 메소드를 구현해야하기 때문에 컴파일 에러가 발생한다.
//    void printNameUppercase();

    // [기본 메소드(default method)]
    // default 키워드를 사용하여 메소드를 선언하여 구현체에 일임하는 것이 아니라, 인터페이스 내부적으로 처리하는 방식.
    // 인터페이스를 구현한 클래스에는 아무런 영향을 미치지 않는다.
    // '해당 인터페이스를 구현한 모든 인스턴스에 추가적인 기능을 제공해주는 강력한 도구'
    // ex) 컬렉션의 removeIf
    default void printNameUppercase() {
        System.out.println("TEST");
    }

    // [스태틱 메소드(static method)]
    // 인터페이스에 스태틱 메소드를 제공할 수 있다.
    static void printNameLowercase() {
        System.out.println("test");
    }

}
