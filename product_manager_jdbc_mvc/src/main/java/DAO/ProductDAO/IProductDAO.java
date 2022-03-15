package DAO.ProductDAO;

import DAO.IGeneralDAO;
import model.Product;

import java.util.List;


public interface IProductDAO extends IGeneralDAO<Product> {
    List <Product> findAllProductByName(String name);
    List<Product> findAllProductByCategoryId(int categoryId);
}
