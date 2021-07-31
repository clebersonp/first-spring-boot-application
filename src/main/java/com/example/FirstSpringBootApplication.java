package com.example;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Greeting;

/**
 * 
 * As annotations RestController e RequestMapping são annotations do Sring
 * MVC(eles não são específicos do Spring Boot)
 * 
 * Annotations @SpringBootApplication -> @EnableAutoConfiguration diz ao Spring
 * Boot para realizar a auto configuração baseado nas dependências adicionadas
 * no projeto.
 * 
 * Maven version: 3.6.1 ou superior JDK version: 11 ou superior
 * 
 * Na raiz do projeto:
 * 
 * Compilar e gerar um jar: JAVA_HOME=/usr/lib/jvm/jdk-11.0.10/ mvn
 * spring-boot:run Executar a aplicação via plugin maven:
 * JAVA_HOME=/usr/lib/jvm/jdk-11.0.10/ mvn clean install Executar a aplicação
 * via java -jar: java -jar
 * target/first-spring-boot-application-0.0.1-SNAPSHOT.jar Abrir o endereço
 * localhost:8080 no browser Finalizar a aplicação: ctrl-c
 * 
 * @author cleberson
 *
 */
@RestController
@SpringBootApplication
public class FirstSpringBootApplication {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "World") final String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
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
