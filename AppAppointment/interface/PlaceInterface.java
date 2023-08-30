package AppAppointment.interface;


import java.util.List;

public interface PlaceInterface {
    List<Place> getAllPlaces();
    
    Place getPlaceById(Long id);
    
    void deletePlaceById(Long id);
    
    void updatePlace(Place place);
}
