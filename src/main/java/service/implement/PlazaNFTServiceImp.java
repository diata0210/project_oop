package service.implement;

import java.util.List;
import java.util.Map;

import models.PlazaNFTModel;
import repository.PlazaNFTRepository;
import repository.implement.PlazaNFTRepositoryImp;
import service.PlazaNFTService;

public class PlazaNFTServiceImp implements PlazaNFTService {
    private static PlazaNFTServiceImp instance;
    private PlazaNFTRepository plazaNFTRepository = PlazaNFTRepositoryImp.getInstance();

    public static PlazaNFTServiceImp getInstance() {
        if (instance == null)
            instance = new PlazaNFTServiceImp();
        return instance;
    }

    @Override
    public List<PlazaNFTModel> getAllModels() {
        return plazaNFTRepository.getAllModels();
    }

    @Override
    public List<String> getNFTsByTags(String tag) {
        return plazaNFTRepository.getNFTsByTags(tag);
    }

   
  
 public Map<String, Integer> getTagFrequencyByMonth(String day) {
        return plazaNFTRepository.getTagFrequencyByMonth(day);
    }
    public static void main(String[] args) {

    }
}