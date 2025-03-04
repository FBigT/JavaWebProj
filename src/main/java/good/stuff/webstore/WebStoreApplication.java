package good.stuff.webstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("good.stuff.webstore.model")
@EnableJpaRepositories("good.stuff.webstore.repository")
public class WebStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStoreApplication.class, args);
    }

}
