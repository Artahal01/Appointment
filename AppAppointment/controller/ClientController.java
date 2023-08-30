package AppAppointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    
    @GetMapping
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientRepository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientRepository.save(client);
    }
    
    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client updatedClient) {
        if (clientRepository.existsById(id)) {
            updatedClient.setIdClient(id);
            return clientRepository.save(updatedClient);
        }
        return null;
    }
    
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientRepository.deleteById(id);
    }
}
