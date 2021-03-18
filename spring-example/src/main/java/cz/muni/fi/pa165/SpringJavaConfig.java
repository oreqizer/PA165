package cz.muni.fi.pa165;

import javax.inject.Inject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("cz.muni.fi.pa165")
@EnableAspectJAutoProxy
public class SpringJavaConfig {

    @Inject
    private ProductDao productDao;

/*    @Bean
//    @Scope(value = "prototype")
    @Scope(value = "singleton")
    public ProductDao productDao() {
        System.err.println("Creating product Dao");
        return new ProductDaoImpl();
    }

    @Bean
    public ProductService productService1() {
        System.err.println("Creating productService1");
        return new ProductServiceImpl(productDao());
    }

    @Bean
    public ProductService productService2() {
        System.err.println("Creating productService2");
        return new ProductServiceImpl(productDao());
    }
*/
    @Bean
    public ProductService productService1() {
        System.err.println("Creating productService2");
        return new ProductServiceImpl(productDao);
    }

}
