package service;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "IPhone 13 Pro Max 512GB", 420000, "New"));
        products.add(new Product(2, "IPhone 13 Pro 512GB", 330000, "New"));
        products.add(new Product(3, "IPhone 13 512GB", 260000, "New"));
    }


    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public void updateById(int id, Product product) {
        for (int i = 0; i <products.size() ; i++) {
            if (products.get(i).getId()==id){
                products.set(id,product);
            }
        }
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }

    }

}
