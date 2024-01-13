package com.example.property.controller;

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

	private Map<String, Object> msft;
	
	private Map<String, Object> coca;
	
}