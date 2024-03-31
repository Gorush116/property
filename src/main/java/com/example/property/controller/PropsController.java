package com.example.property.controller;

import com.example.property.fninterface.FnService;
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

	private final FnService fnService;
	
	// @RequiredArgsConstructor > @Retention > 어노테이션의 존재 범위 > SOURCE : 컴파일시 제거 / CLASS : 클래스 생성시 제거 / RUNTIME : 실행시 제거
	
	@GetMapping("/props")
	public void props() {
//		System.out.println(msftUrl);
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

	@GetMapping("/fnTest")
	public void fnInf() {
//		var result = fnService.getResult((a, b) -> {
//			return a * b;	// 추상 메소드 구현
//		});

//		var result = fnService.getResult(this::multi); // 메소드를 담아 보내 실행시킨다
//		System.out.println("result = " + result);

		var result2 = fnService.getResult(1, 3, this::test); // 메소드를 담아 보내 실행시킨다
		// enum, method를 param으로 담아 분기시킬 수 있음
		// 개발자가 실행시키는 표준만 존재하면 서비스를 추가하거나 별도의 처리 없이 분기 가능함(함수형 인터페이스의 장점)

		System.out.println("result2 = " + result2);

		var testVal1 = "test";
		{	// testVal1 의 내부 블록(testVal1)
			var testVal2 = "test2";
			System.out.println("testVal1 = " + testVal1);
			System.out.println("inner block result2 = " + result2);
		}	// 내부 블록 end

//		System.out.println("testVal2 = " + testVal2); // 내부 블록 사용에 있는 변수 외부 블록에서 사용 불가

	}

	public int multi(int a, int b) {
		System.out.println("mutil method execute");
		var c = a + b;
		return c * 3;

	}

	public int test(int a, int b) {
		System.out.println("test method execute");
		var c = a + b;
		return c * 5;

	}
	
}
