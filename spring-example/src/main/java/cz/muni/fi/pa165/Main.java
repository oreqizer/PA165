package cz.muni.fi.pa165;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String ... args) {

        //noSpring();
        //springXmlContext();
        //springAnnotationContext();
        springJavaConfigContext();
    }

    private static void springXmlContext() {

        ApplicationContext applicationContext 
                = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        cz.muni.fi.pa165.ProductService productService
                = applicationContext.getBean(ProductService.class);

        System.err.println(productService.getAllProducts());

    }

    private static void springAnnotationContext() {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("cz.muni.fi.pa165");

        ProductService productService
                = applicationContext.getBean(ProductService.class);

        System.err.println(productService.getAllProducts());

    }

    private static void springJavaConfigContext() {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(SpringJavaConfig.class);

        ProductService productService
                = applicationContext.getBean("productService1", ProductService.class);

        System.err.println(productService.getAllProducts());

    }

    private static void noSpring() {
        
        ProductDao productDao = new ProductDaoImpl();
        ProductService productService = new ProductServiceImpl(productDao);
        System.out.println(productService.getAllProducts());
        
    }

}
