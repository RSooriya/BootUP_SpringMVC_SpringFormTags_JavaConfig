package com.sooriya.Configuration;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ComponentScan("com.sooriya")
@EnableWebMvc
@Configuration
public class SpringConfig {

@Bean
public ViewResolver viewResolver()
{
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}
// for retrieving util properties file - StudentController3
@Bean(name = "countryOptions")
public PropertiesFactoryBean countryOptions() {
    PropertiesFactoryBean bean = new PropertiesFactoryBean();
    bean.setLocation(new ClassPathResource("../properties/countries.properties"));
    return bean;
}
@Bean(name="genderOptions")
public PropertiesFactoryBean genderOptions()
{
	PropertiesFactoryBean bean = new PropertiesFactoryBean();
	bean.setLocation(new ClassPathResource("../properties/gender.properties"));
	return bean;
}
@Bean(name ="languageOptions")
public PropertiesFactoryBean languageOptions() {
    PropertiesFactoryBean bean = new PropertiesFactoryBean();
    bean.setLocation(new ClassPathResource("../properties/language.properties"));
    return bean;
}

}
