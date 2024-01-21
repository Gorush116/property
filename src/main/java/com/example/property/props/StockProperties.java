package com.example.property.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "stock") // properties를 명시하는 어노테이션
public class StockProperties {

	private StockDetailProperties msft;	// 타입을 정의해서 원하는 자료형으로 받을 수 있음
	
	private StockDetailProperties coca;

	public StockDetailProperties getMsft() {
		return msft;
	}

	public void setMsft(StockDetailProperties msft) {
		this.msft = msft;
	}

	public StockDetailProperties getCoca() {
		return coca;
	}

	public void setCoca(StockDetailProperties coca) {
		this.coca = coca;
	}

	
	
}
