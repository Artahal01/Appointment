package AppAppointment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
public class PlaceController {
    @Autowired
    private PlaceRepository placeRepository;
    
    @GetMapping
    public List<Place> getAllPlaces() {
        return placeRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Place getPlaceById(@PathVariable Long id) {
        return placeRepository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Place createPlace(@RequestBody Place place) {
        return placeRepository.save(place);
    }
    
    @PutMapping("/{id}")
    public Place updatePlace(@PathVariable Long id, @RequestBody Place updatedPlace) {
        if (placeRepository.existsById(id)) {
            updatedPlace.setIdPlace(id);
            return placeRepository.save(updatedPlace);
        }
        return null;
    }
    
    @DeleteMapping("/{id}")
    public void deletePlace(@PathVariable Long id) {
        placeRepository.deleteById(id);
    }
}
