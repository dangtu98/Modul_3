package service.StoryService;

import DAO.StoryDAO.IStoryDAO;
import DAO.StoryDAO.StoryDAO;
import model.Story;

import java.util.List;

public class StoryService implements IStoryService{

private IStoryDAO storyDAO;

    public StoryService(IStoryDAO storyDAO) {
        this.storyDAO = storyDAO;
    }

    @Override
    public List<Story> findAll() {
        return storyDAO.findAll();
    }

    @Override
    public Story findById(int id) {
        return storyDAO.findById(id);
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
