package com.example.property.props;

// setter / equals and hashCode가 자동으로 setting 된 클래스와 같다
// response를 그대로 사용할 때 유용함
// 추가적인 가공이 필요없을 때 사용하면 좋음
// 요소 값 가져올때 : RecordVo.count() 사용시 값 가져오기 가능
// 상속, 구현 불가
public record RecordVo(int count, int maxCount) {
    // 값 setting 시 내부 블록에서 조건체크 가능
}
