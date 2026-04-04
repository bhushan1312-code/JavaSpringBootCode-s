package org.example.Configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;


@Configuration
@ComponentScan(basePackages = "org.example")
//@PropertySource("classpath:application.properties")

public class SpringConfiguration {

    @Autowired
    private Environment environment;

@Bean
    public DataSource dataSource(){

    DriverManagerDataSource dataSource =  new DriverManagerDataSource();
              dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
              dataSource.setUrl("jdbc:mysql://localhost:3306/college_db121");
              dataSource.setUsername("root");
              dataSource.setPassword("root");


        return  dataSource;
    }

    @Bean

    public JdbcTemplate jdbcTemplate(){
        return  new JdbcTemplate(dataSource());
    }
}
