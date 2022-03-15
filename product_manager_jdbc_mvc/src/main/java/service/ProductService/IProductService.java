package service.ProductService;

import model.Product;
import service.IGeneralService;

import java.util.List;

public interface IProductService extends IGeneralService<Product> {
    List<Product> findAllProductByName(String name);
    List<Product> findAllProductByCategoryId(int categoryId);
}
