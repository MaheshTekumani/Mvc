package com.blog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import(PersistenceConfig.class)
@ComponentScan(basePackages = { "com.blog.service" })
@EnableTransactionManagement
public class RootConfig {

}
