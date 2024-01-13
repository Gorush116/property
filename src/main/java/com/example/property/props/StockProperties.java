package com.example.property.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "stock") // properties를 명시하는 어노테이션
public class StockProperties {

	private StockDetailProperties msft;
	
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
