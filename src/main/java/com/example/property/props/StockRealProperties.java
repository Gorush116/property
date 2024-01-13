package com.example.property.props;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "stock")
public class StockRealProperties {

	private Map<StockType, StockInfoProperties> info;
	
	private Map<StockType, StockCommonProperties> common;
	
	public StockInfoProperties getInfoDetail(StockType stockType) {
		return info.get(stockType);
	}
	
	public StockCommonProperties getCommonDetail(StockType stockType) {
		return common.get(stockType);
	}
	
}
