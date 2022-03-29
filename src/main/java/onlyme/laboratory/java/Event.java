package onlyme.laboratory.java;

/**
 * 추상 클래스 : 추상 메서드가 하나라도 있으면 추상 클래스
 *  - 객체를 만들 수 없음.
 *  - 서브 클래스를 만드는 용도로 사용 됨.
 */
public abstract class Event {

    // 추상 메서드는 선언만 있고 구현 부분이 없는 메서드
    public abstract boolean isRelevant();

}
