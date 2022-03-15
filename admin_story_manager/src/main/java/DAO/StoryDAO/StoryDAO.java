package DAO.StoryDAO;

import DAO.DBConnection;
import model.Story;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StoryDAO implements IStoryDAO {

    public static final String SQL_SELECT_ALL_STORY = "select * from Story";
    public static final String SELECT_FROM_STORY_WHERE_ID = "select * from story where id = ?";
    private Connection connection = DBConnection.getConnection();

    public StoryDAO() {
    }

    @Override
    public List<Story> findAll() {
        List<Story> stories = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ALL_STORY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                int categoryId = resultSet.getInt("categoryId");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String author = resultSet.getString("author");
                String sub = resultSet.getString("dateSubmited");
                String img = resultSet.getString("img");
                Story story = new Story(id, categoryId, name, price, author, sub, img);
                stories.add(story);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stories;
    }

    @Override
    public Story findById(int id) {
        Story story = new Story();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FROM_STORY_WHERE_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int categoryId = resultSet.getInt("categoryId");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String author = resultSet.getString("author");
                String sub = resultSet.getString("dateSubmited");
                String img = resultSet.getString("img");
                story = new Story(id,categoryId,name,price,author,sub,img);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return story;
    }

    @Override
    public boolean create(Story story) {
        return false;
    }

    @Override
    public boolean updateById(int id, Story story) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
