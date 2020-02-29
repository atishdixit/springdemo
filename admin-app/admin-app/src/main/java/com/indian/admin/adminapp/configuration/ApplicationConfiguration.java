package com.indian.admin.adminapp.configuration;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({ "classpath:configuration.properties",
//	"classpath:jsm.properties",
//	"classpath:${profile}.properties" })

@PropertySources({
	@PropertySource("classpath:configuration.properties"),
	@PropertySource("classpath:jsm.properties"),
	@PropertySource("classpath:${profile}.properties") 
})
public class ApplicationConfiguration {

	@Autowired
	Environment env;

	@Value("${admin.user}")
	private String admin;

	@Value("${admin.pass}")
	private String password;

	@Value("${jmsUser}")
	private String jmsUser;

	@Value("${jmsPass}")
	private String jmsPass;

	@Value("${USERNAME}")
	private String username;

	@Bean
	public User getUser() {
		System.out.println(env.getProperty("USERNAME"));
		System.out.println(jmsUser);
		System.out.println(jmsPass);
		
		System.out.println("admin:-"+admin);
		System.out.println("passwrod:-"+password);
		
		System.out.println(username);
		return new User(username);
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer property() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		return configurer;
	}

	public SessionFactory sessionFactory() {
		return null;
	}

	public DataSource dataSource() {
		return null;
	}
}
