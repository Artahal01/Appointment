import java.util.List;

public interface PlaceService {
    List<Place> getAllPlaces();
    
    Place getPlaceById(Long id);
    
    void deletePlaceById(Long id);
    
    void updatePlace(Place place);
}
