package com.github.rupert654.listbindingbug;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ExampleProperties.class, ExampleListProperties.class})
public class Application implements CommandLineRunner {
  private final ExampleProperties singleProperties;

  private final ExampleListProperties multipleProperties;

  public Application(final ExampleProperties singleProperties,
      final ExampleListProperties multipleProperties) {
    this.singleProperties = singleProperties;
    this.multipleProperties = multipleProperties;
  }

  public static void main(String[] args){
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(final String... args) throws Exception {
    System.out.println("BINDING WITHOUT LIST");
    System.out.println(singleProperties);

    System.out.println("BINDING WITH LIST");
    multipleProperties.getList().forEach(System.out::println);
  }
}
