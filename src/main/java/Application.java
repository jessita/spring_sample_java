import com.pluralsight.service.CustService;
import com.pluralsight.service.CustServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jsst_ on 12/7/2017.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustService custService= applicationContext.getBean("custService",CustService.class);
        System.out.println(custService);
        CustService custService2= applicationContext.getBean("custService",CustService.class);
        System.out.println(custService2);
        System.out.println(custService.findAll().get(0).getFirstName());
    }
}
