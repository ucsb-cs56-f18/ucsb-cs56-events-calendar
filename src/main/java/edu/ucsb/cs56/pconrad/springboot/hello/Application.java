package edu.ucsb.cs56.pconrad.springboot.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class Application implements CommandLineRunner{
    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
    }
    @Override
public void run(String... args) throws Exception {
  main.java.edu.ucsb.cs56.events_calendar.Scraping.main(new String[0]);
  }
}
