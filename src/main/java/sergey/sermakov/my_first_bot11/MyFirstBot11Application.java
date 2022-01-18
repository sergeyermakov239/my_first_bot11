package sergey.sermakov.my_first_bot11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class MyFirstBot11Application {

    public static void main(String[] args) {
        ApiContextInitializer.init();

        SpringApplication.run(MyFirstBot11Application.class, args);
    }

}
