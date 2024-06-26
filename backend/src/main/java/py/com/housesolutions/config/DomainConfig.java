package py.com.housesolutions.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EntityScan("py.com.housesolutions.domain")
@EnableJpaAuditing
public class DomainConfig {
}
