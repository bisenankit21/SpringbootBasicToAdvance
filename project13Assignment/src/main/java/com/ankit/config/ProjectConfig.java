package com.ankit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.ankit.config","com.ankit.impl", "com.ankit.service"  })
@ComponentScan(basePackageClasses = {com.ankit.beans.Person.class, com.ankit.service.VehicleService.class})
public class ProjectConfig {

}
