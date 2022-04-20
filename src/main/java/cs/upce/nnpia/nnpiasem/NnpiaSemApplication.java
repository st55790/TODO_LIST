package cs.upce.nnpia.nnpiasem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class NnpiaSemApplication {

    public static void main(String[] args) {
        SpringApplication.run(NnpiaSemApplication.class, args);
    }

}
