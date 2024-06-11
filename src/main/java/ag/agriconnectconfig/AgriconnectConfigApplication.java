package ag.agriconnectconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AgriconnectConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriconnectConfigApplication.class, args);
	}

}
