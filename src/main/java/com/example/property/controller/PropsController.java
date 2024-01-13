package com.example.property.controller;

import com.example.property.props.FtpProperties;
import com.example.property.props.StockProperties;
import com.example.property.props.StockRealProperties;
import com.example.property.props.StockType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.property.service.MsftService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class PropsController {

	
//	@Value("${stock.msft.url}")
//	private String msftUrl;
	
	private final StockProperties stockProperties;
	
	private final FtpProperties ftpProperties;
	
	private final StockRealProperties stockRealProperties;
	
	private final MsftService msftService;
	
	// @RequiredArgsConstructor > @Retention > 어노테이션의 존재 범위 > SOURCE : 컴파일시 제거 / CLASS : 클래스 생성시 제거 / RUNTIME : 실행시 제거
	
	@GetMapping("/props")
	public void props() {
////		System.out.println(msftUrl);
//		System.out.println(stockProperties.getMsft().getAmt());
//		
//		System.out.println(stockProperties.getCoca().getAmt());
		
		System.out.println(ftpProperties.getMsft());
		System.out.println(ftpProperties.getCoca());
	}
	
	@GetMapping("/index")
	public void index() {
//		System.out.println(StockType.msft);
		
//		System.out.println(StockType.msft.ordinal()); // enum 내 배열순서
		StockType.msft.name();
		
		StockType type = StockType.msft;
//		System.out.println(type.getType());
//		System.out.println(type.execute(3, 5));
		
		StockType type2 = StockType.valueOf("coca");
//		System.out.println(type2.name());
//		System.out.println(type2.execute(1, 4));
		
//		System.out.println(stockRealProperties.getInfo().toString());
//		System.out.println(stockRealProperties.getCommon().toString());
		
//		System.out.println(stockRealProperties.getInfoDetail(StockType.msft));
		
		System.out.println(msftService.getType());
	}
	
}
