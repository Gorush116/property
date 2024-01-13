package com.example.property.fninterface;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FnService {

    public int getResult(int a, int b, FunctionalInterface fn) {

//        var c = a;      // Java 11 부터 새로 생김, compile 단계에서 자동으로 자료형을 맞춰줌
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

        return list.stream().anyMatch(a -> a.equals("msft"));

        /**
         * Java에서 만든 함수형 인터페이스
         * Supplier : 0개의 파라미터 없음, return 있음
         * Consumer : 1개의 파라미터를 받고, return은 없음
         * Function
         * Predicate : 1개의 파라미터를 받아서, boolean을 return
         * 접두사에 따라 받는 파라미터의 개수가 달라질 수 있음
         */
    }
}
