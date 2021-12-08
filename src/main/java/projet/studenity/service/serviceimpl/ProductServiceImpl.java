package projet.studenity.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.studenity.dao.ProductDao;
import projet.studenity.model.Product;
import projet.studenity.service.ProductService;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;


    public Product findProductById(long id) {
        Product product = productDao.findProductById(id);
        return product;
    }

    @Override
    public List<Product> findProductByName(String name) {
        if(productDao.findProductByName(name)!=null) {
            List<Product> listProduct = productDao.findProductByName(name);
            return listProduct;
        }
        else return null;
    }

    @Override
    public void createProduct(Product product) {
        productDao.createProduct(product);
    }

    @Override
    public void updateProduct(Long id, Product product) {
        productDao.updateProduct(id,product);
    }

    @Override
    public void deleteProduct(Long id) {
        productDao.deleteProductById(id);
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

}
