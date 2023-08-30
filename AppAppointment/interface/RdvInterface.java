package AppAppointment.interface;


import java.util.List;

public interface RdvDAO {
    List<Rdv> getAllRdvs();
    
    Rdv getRdvById(Long id);
    
    void deleteRdvById(Long id);
    
    void updateRdv(Rdv rdv);
}

