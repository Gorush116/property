package com.example.property.service;

import org.springframework.stereotype.Service;

import com.example.property.controller.StockCommonProperties;
import com.example.property.controller.StockInfoProperties;
import com.example.property.controller.StockRealProperties;
import com.example.property.controller.StockType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Service
public class MsftService { // 반드시 복습할 것!!
	
	private final StockInfoProperties sip;		// 해당 객체는 주입받을 수 없음(껍데기밖예 없음)
	
	private final StockCommonProperties smp;	// 해당 객체는 주입받을 수 없음(껍데기밖예 없음)
	
	public MsftService(StockRealProperties stockRealProperties) { // 주입받을 수 있는 객체를 찾아서 세팅
		this.sip = stockRealProperties.getInfoDetail(StockType.msft);
		this.smp = stockRealProperties.getCommonDetail(StockType.msft);
	}
	
	public String getType() {
		
		MsftDto dto = new MsftDto();
		dto.setTtl("제목");
		dto.setCont("내용");
		System.out.println(MsftType.infra);
		
		System.out.println(dto.toString());
		return sip.getType();
		
	}
	
	enum MsftType {
		infra, ai, network;
	}
	
	@Getter
	@Setter
	@ToString
	static class MsftDto {
		// Map을 안쓰는 이유 : 1. Type-safe 2. 다른 개발자가 식별하기 쉬움
		// 내부 클래스 사용 권장 조건 : 해당 클래스 내에서만 사용할 때
		private String ttl;
		private String cont;
	}

}
