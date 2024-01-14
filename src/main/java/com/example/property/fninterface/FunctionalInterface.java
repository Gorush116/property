package com.example.property.fninterface;
@java.lang.FunctionalInterface
public interface FunctionalInterface {

    // 함수형 인터페이스 -> OOP에서 함수형 프로그래밍을 사용하기 위해 도입
    // 공통 사용로직을 구현시 다른 업무에 대한 이해 및 현재의 ISSUE / 추후 다른 것에 대한 가능성도 열어둔 채로 짜야 함
    /**
     프로그래밍 패러다임
     - 명령형(How) - 절차지향, 객체지향 언어
     - 선언형(What) - 함수형 프로그래밍

     함수형 프로그래밍의 조건(구글링 해볼 것)
        - 메소드를 파라미터로 담을 수 있어야 함
        - 파라미터 자체 가공 금지
        - 전역변수 사용 X
     -> 해당 조건을 다 지키지 않았다고 함수형 인터페이스가 아니지는 않음

     REST : Url에 resource를 표현

     */

    int execute(int a, int b); // (public abstract) void execute(int a, int b);

//    void execute2(int a, int b); // 함수형 인터페이스에서는 하나의 메소드만 정의할 수 있다.
    
    default int execute3(int a, int b) { // default 구현 가능
        return a + b;
    }

}
