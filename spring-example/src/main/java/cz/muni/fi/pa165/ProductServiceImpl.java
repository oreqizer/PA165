package cz.muni.fi.pa165;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Named
public class ProductServiceImpl implements ProductService, InitializingBean {

    private ProductDao productDao;

    public ProductServiceImpl() {
    }

    @Inject
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    //@Inject
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    @Override
    public void afterPropertiesSet() {
        System.err.println("Component initialized");
    }

}
