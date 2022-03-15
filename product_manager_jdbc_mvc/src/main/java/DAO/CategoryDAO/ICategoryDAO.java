package DAO.CategoryDAO;

import DAO.IGeneralDAO;
import model.Category;

public interface ICategoryDAO extends IGeneralDAO<Category> {
    boolean deleteCategoryUsingProcedure(int id);
}
