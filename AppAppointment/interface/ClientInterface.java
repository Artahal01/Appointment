package AppAppointment.interface;

import java.util.List;

public interface ClientDAO {
    List<Client> getAllClients();
    
    Client getClientById(Long id);
    
    void deleteClientById(Long id);
    
    void updateClient(Client client);
}
