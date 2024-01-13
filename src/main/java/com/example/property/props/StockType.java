package com.example.property.props;

import lombok.Getter;

public enum StockType { // 계층구조로 활용 가능
	
	msft("it", 375) {
		@Override
		public int execute(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	},
	coca("drink", 50) {
		@Override
		public int execute(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
	
	
	private final String type;
	private final int amt;
	
	private StockType(String type, int amt) {
		this.type = type;
		this.amt = amt;
	}

	public String getType() {
		return type;
	}

	public int getAmt() {
		return amt;
	}
	
	public abstract int execute(int a, int b); // enum 내에 추상 메소드 생성시 enum 요소별로 각각 오버라이딩 해야 함
	
}
