package onlyme.laboratory.book.effectiveJava.no1;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        /**
         * 생성자를 통한 객체 인스턴스 생성
         */
        Member m1 = new Member("devyu", 20);

        /**
         * 정적 팩터리 메서드를 통한 인스턴스 구하기
         */
        Member m2 = Member.getInstance();

    }



}
