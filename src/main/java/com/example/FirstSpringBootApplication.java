package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * As annotations RestController e RequestMapping são annotations do Sring
 * MVC(eles não são específicos do Spring Boot)
 * 
 * Annotations @SpringBootApplication -> @EnableAutoConfiguration diz ao Spring
 * Boot para realizar a auto configuração baseado nas dependências adicionadas
 * no projeto.
 * 
 * Maven version: 3.6.1 ou superior
 * JDK version: 11 ou superior
 * 
 * Na raiz do projeto:
 * 
 * Compilar e gerar um jar: JAVA_HOME=/usr/lib/jvm/jdk-11.0.10/ mvn spring-boot:run
 * Executar a aplicação via plugin maven: JAVA_HOME=/usr/lib/jvm/jdk-11.0.10/ mvn clean install
 * Executar a aplicação via java -jar: java -jar target/first-spring-boot-application-0.0.1-SNAPSHOT.jar
 * Abrir o endereço localhost:8080 no browser
 * Finalizar a aplicação: ctrl-c
 * 
 * @author cleberson
 *
 */
@RestController
@SpringBootApplication
public class FirstSpringBootApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}

	public static void main(String[] args) {

		/**
		 * 
		 * Método main é o Entry Point da aplicação e delega a classe
		 * SpringApplication.run para executar e iniciar a aplicação Spring.
		 * 
		 */
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

}
