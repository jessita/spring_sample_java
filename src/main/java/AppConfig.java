import com.pluralsight.repo.CustRepo;
import com.pluralsight.repo.HibernateCustRepoImpl;
import com.pluralsight.service.CustService;
import com.pluralsight.service.CustServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by jsst_ on 12/8/2017.
 */
@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean(name="propSrcPlaceholderConfig")
    public static PropertySourcesPlaceholderConfigurer getPlaceholderConfigurer(){
        return  new PropertySourcesPlaceholderConfigurer();
    }

//    @Bean(name="custService")
//    public CustService getCustService() {
//        CustServiceImpl custService = new CustServiceImpl();
//       // custService.setCustRepo(getCustRepo());
//        return custService;
//    }
//    @Bean(name = "custRepo")
//    public CustRepo getCustRepo() {
//        return new HibernateCustRepoImpl();
//    }
}
