package com.mercury.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.mercury"})		// contains all sub folders
public class IocConfig {

}
