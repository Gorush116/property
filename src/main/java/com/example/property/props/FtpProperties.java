package com.example.property.props;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "ftp")
public class FtpProperties {
	// ConfigurationProperties를 통해 설정파일에 있는 property들을 가져올 수 있음
	private Map<String, Object> msft; // 
	
	private Map<String, Object> coca;
	
}
