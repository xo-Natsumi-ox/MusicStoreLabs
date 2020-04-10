package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.PopularRepository;
import ua.lviv.iot.musicStore.model.Popular;

import java.util.List;

@Service
public class PopularService {
    @Autowired
    private PopularRepository popularRepository;

    public Popular createPopular(Popular popular) {
        return popularRepository.save(popular);
    }

    public boolean existPopular(Integer id) {
        return popularRepository.existsById(id);
    }
    public Popular getPopular(Integer id) {
        return popularRepository.findById(id).get();
    }

    public List<Popular> getPopular() {
        return popularRepository.findAll();
    }

    public void deletePopular(Integer id) {
            popularRepository.deleteById(id);
    }

    public Popular updatePopular(Integer id, Popular popular) {
            Popular populars = popularRepository.findById(id).get();
            popular.setId(id);
            populars.setId(id);
            popularRepository.save(popular);
            return populars;
    }
}
