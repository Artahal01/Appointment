package AppAppointment.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Rdv {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAppointment;
    
    private String appointmentRequest;
    private LocalDateTime appointmentDate;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name = "idPlace")
    private Place place;
}


