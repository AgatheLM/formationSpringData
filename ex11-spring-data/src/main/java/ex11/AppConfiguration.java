package ex11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
@PropertySource(value="classpath:application.properties")
public class AppConfiguration {
	@Autowired
	private Environment environment;
	
}
