package ag.agriconnectconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
// Activation serveur de configuration
@EnableConfigServer
// Activation enregistrement Annuaire
@EnableDiscoveryClient
public class AgriconnectConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriconnectConfigApplication.class, args);
	}

}
