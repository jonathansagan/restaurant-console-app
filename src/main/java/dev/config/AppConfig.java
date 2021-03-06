package dev.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



// cas DAO Mémoire : ajout d'un @ dans la classe PlatDaoMemoire
// Le stéréotype @Configuration précise que cette classe servira de configuration.
@Configuration
@ComponentScan({"dev.ihm", "dev.service","dev.dao"})

// Cas Dao Fichier
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
	
	
}