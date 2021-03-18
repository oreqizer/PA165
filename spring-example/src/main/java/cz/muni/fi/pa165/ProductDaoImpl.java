package cz.muni.fi.pa165;

import java.util.Arrays;
import java.util.List;
import javax.inject.Named;
import org.springframework.stereotype.Component;

//@Component
@Named
@Wine
public class ProductDaoImpl implements ProductDao {

    @Override
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product("Ryzlink rýnský 2009"),
                new Product("Ryzlink vlašský 2010")
        );
    }

}
