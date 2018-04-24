package craw.crawdblogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CrawdbloggerApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		
//		SpringApplication application = new SpringApplication(CrawdbloggerApplication.class);
//		
//		Map<String, Object> map = new HashMap<>();
//		map.put("SERVER_PORT", "8081");
//		application.setDefaultProperties(map);
//		
//		application.run(args);
		

		SpringApplication.run(CrawdbloggerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrawdbloggerApplication.class);
	}
}
