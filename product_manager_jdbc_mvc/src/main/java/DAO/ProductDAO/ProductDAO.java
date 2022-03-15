package DAO.ProductDAO;

import DAO.DBConnection;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements IProductDAO {
    public static final String update_product = "update product set ten = ? , price = ? , mota = ? , category_id = ? , where id = ?";
    public static final String select_product = "select * from product";
    public static final String select_product_where_id = "select * from product where id =?";
    public static final String insert_product = "insert into product(ten,price,mota,category_id)values (?,?,?,?)";
    public static final String delete_product = "delete from product where id = ?";
    public static final String select_product_name = "select * from product where ten like ?";
    public static final String select_product_by_category = "select * from product where category_id = ? ";
    Connection connection = DBConnection.getConnection();

    public ProductDAO() {
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(select_product);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("ten");
                double price = resultSet.getDouble("price");
                String description = resultSet.getString("mota");
                int categoryid = resultSet.getInt("category_id");
                Product product = new Product(id, name, price, description);
                product.setCategoryId(categoryid);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        Product product = new Product();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(select_product_where_id);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("ten");
                double price = resultSet.getDouble("price");
                String description = resultSet.getString("mota");
                int categoryid = resultSet.getInt("category_id");
                product = new Product(id, name, price, description);
                product.setCategoryId(categoryid);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean create(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insert_product);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setInt(4,product.getCategoryId());
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateById(int id, Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(update_product);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setInt(4, product.getCategoryId());
            preparedStatement.setInt(5, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(delete_product);
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Product> findAllProductByName(String name) {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(select_product_name);
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nameFromSQL = rs.getString("ten");
                double price = rs.getDouble("price");
                String description = rs.getString("mota");
                int categoryId = rs.getInt("category_id");
                Product product = new Product(id, nameFromSQL, price, description);
                product.setCategoryId(categoryId);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public List<Product> findAllProductByCategoryId(int categoryId) {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(select_product_by_category);
            preparedStatement.setInt(1, categoryId);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nameFromSQL = rs.getString("ten");
                double price = rs.getDouble("price");
                String description = rs.getString("mota");
                int categoryid = rs.getInt("category_id");
                Product product = new Product(id, nameFromSQL, price, description);
                product.setCategoryId(categoryid);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }
}
