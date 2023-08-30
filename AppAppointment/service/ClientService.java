import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {
    @Autowired
    private PlaceDAO placeDAO;
    
    @Override
    public List<Place> getAllPlaces() {
        return placeDAO.getAllPlaces();
    }
    
    @Override
    public Place getPlaceById(Long id) {
        return placeDAO.getPlaceById(id);
    }
    
    @Override
    public void deletePlaceById(Long id) {
        placeDAO.deletePlaceById(id);
    }
    
    @Override
    public void updatePlace(Place place) {
        placeDAO.updatePlace(place);
    }
}
