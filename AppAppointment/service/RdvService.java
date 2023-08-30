import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RdvServiceImpl implements RdvService {
    @Autowired
    private RdvDAO rdvDAO;
    
    @Override
    public List<Rdv> getAllRdvs() {
        return rdvDAO.getAllRdvs();
    }
    
    @Override
    public Rdv getRdvById(Long id) {
        return rdvDAO.getRdvById(id);
    }
    
    @Override
    public void deleteRdvById(Long id) {
        rdvDAO.deleteRdvById(id);
    }
    
    @Override
    public void updateRdv(Rdv rdv) {
        rdvDAO.updateRdv(rdv);
    }
}
