package core.bootstrap;

import com.sren.core.service.CalService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: renshuai
 * @date: 2019/09/05 下午4:22
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "com.sren.core.service")
public class CalBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalBootStrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run(args);
        CalService calService = context.getBean(CalService.class);
        System.out.println(calService.sum(1,2,3,4,5,6,7,8));
    }
}
