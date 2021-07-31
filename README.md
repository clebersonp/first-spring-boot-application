# Descrição
Estudo do framework *_Spring Boot_* versão 2.5.3. [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/).
Aplicação de estudo *_spring boot_* com a minima estrutura necessária para expor endpoint _Hello World_. [Aplicação Spring Boot 
](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#getting-started.first-application).

### Requerimentos
- Maven versão 3.6.1 ou superior. [Maven installation](https://maven.apache.org/install.html).
- JDK versão 11 ou superior [JDK installation](https://adoptopenjdk.net/).

### Build da aplicação exemplo via plugin maven:
Digitar `mvn clean install` no diretório raiz do projeto. Você deve ver uma saída semelhante a seguinte:
```maven
$ mvn clean install
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.3)

2021-07-31 18:58:34.831  INFO 7312 --- [           main] c.e.FirstSpringBootApplicationTests      : Starting FirstSpringBootApplicationTests using Java 15.0.1
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.330 s
[INFO] Finished at: 2021-07-31T18:58:38-03:00
[INFO] ------------------------------------------------------------------------
```

### Execução da aplicação exemplo a partir do `fat jar` gerado:
Digitar `java -jar target/first-spring-boot-application-0.0.1-SNAPSHOT.jar` no diretório raiz do projeto. Você deve ver uma saída semelhante a seguinte:
```java
$ java -jar target/first-spring-boot-application-0.0.1-SNAPSHOT.jar 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.3)

2021-07-31 19:02:55.387  INFO 7431 --- [           main] com.example.FirstSpringBootApplication   : Starting FirstSpringBootApplication v0.0.1-SNAPSHOT using Java 15.0.1
2021-07-31 19:02:57.548  INFO 7431 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-07-31 19:02:57.563  INFO 7431 --- [           main] com.example.FirstSpringBootApplication   : Started FirstSpringBootApplication in 2.861 seconds (JVM running for 3.437)
```

### Execução da aplicação exemplo via `plugin maven`:
Digitar `mvn spring-boot:run` no diretório raiz do projeto. Você deve ver uma saída semelhante a seguinte:
```maven
$ mvn spring-boot:run

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.3)

2021-07-31 18:56:36.932  INFO 7157 --- [           main] com.example.FirstSpringBootApplication   : Starting FirstSpringBootApplication using Java 15.0.1
2021-07-31 18:56:38.082  INFO 7157 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-07-31 18:56:38.091  INFO 7157 --- [           main] com.example.FirstSpringBootApplication   : Started FirstSpringBootApplication in 1.51 seconds (JVM running for 1.791)
```
Se você abrir o browser no endereço [`http://localhost:8080/greeting?name=John`](http://localhost:8080/greeting?name=John) você deve ver a seguinte saída:
```json
{
    "id": 14,
    "content": "Hello, John!"
}
```

## Referências
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#getting-started.first-application) - Desenvolvendo a primeira aplicação Spring Boot.

