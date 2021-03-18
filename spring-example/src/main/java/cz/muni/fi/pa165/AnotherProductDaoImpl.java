package cz.muni.fi.pa165;

import java.util.Arrays;
import java.util.List;
import javax.inject.Named;

//@Named
public class AnotherProductDaoImpl implements ProductDao {

    @Override
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product("Suzuki Intruder"),
                new Product("Honda Shadow")
        );
    }

}
