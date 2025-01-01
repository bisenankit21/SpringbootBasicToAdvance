package com.ankit.config;

import com.ankit.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.ankit.beans")    // from where it should scan the beans
public class ProjectConfig {

}
