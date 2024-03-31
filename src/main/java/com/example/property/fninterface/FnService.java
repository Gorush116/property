package com.example.property.fninterface;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FnService {

    public int getResult(int a, int b, FunctionalInterface fn) {

//        var c = a;      // Java 10 부터 새로 생김, compile 단계에서 자동으로 자료형을 맞춰줌
//        var d = b;

//        var list2 = getList();

        return fn.execute(a, b);
    }

    public List<String> getList() {
        List<String> list = new ArrayList<>();
        list.add("a");

        return list;
    }

    public boolean isTrue() {
        List<String> list = new ArrayList<>();
        list.add("msft");
        list.add("apple");

        var param = "param";

        // text block (13~ / 15 )
        var sql = """
                SELECT 
                       1234
                     , %s
                FROM dual
        """.formatted(param); // formatted로 param 동적 입력

        return list.stream().anyMatch(a -> a.equals("msft"));

        /**
         * Java에서 만든 함수형 인터페이스
         * Supplier : 0개의 파라미터 없음, return 있음
         * Consumer : 1개의 파라미터를 받고, return은 없음
         * Function
         * Predicate : 1개의 파라미터를 받아서, boolean을 return
         * 접두사에 따라 받는 파라미터의 개수가 달라질 수 있음
         */

        /**
         * Java 버전별 특징
         * 1.8(무한도전) : stream, optional, lambda, 메모리 구조 변화
         * 10 : var
         * 11
         * 13 : text block
         * 17 : record(불변 객체), sealed class/interface(상속 제약)
         *
         * heap 구조(1.7)
         * Eden : new 생성시
         * s0 : gc 실행 후 남은 참조된 것들
         * s1
         * old generation : 계속 사용하고 있는 인스턴스
         * perm generation : metaData
         * os
         * xms xmx 같은 숫자로 잡아놓는 것
         *
         * heap 구조(1.8~)
         * - perm generation 삭제
         * - meta space 추가 => OS가 관리(Linux)
         *
         *
         * pom.xml resources 태그
         * - src 외에 다른 경로의 폴더를 build 대상으로 잡고 싶을 때 사용
         */


    }
}
