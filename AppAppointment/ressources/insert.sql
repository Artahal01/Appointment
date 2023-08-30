INSERT INTO place (place_name, address) VALUES
    ('Salle A', '123 Rue Principale'),
    ('Bureau B', '456 Avenue Secondaire'),
    ('Salle de Conférence', '789 Place Centrale'),
    ('Espace Coworking', '555 Rue des Innovateurs'),
    ('Salle de Réunion', '888 Avenue Collaborative');

INSERT INTO client (name, phone_number, address, email) VALUES
    ('Alice Johnson', '123-456-7890', '321 Elm Street', 'alice@example.com'),
    ('Bob Smith', '987-654-3210', '456 Oak Avenue', 'bob@example.com'),
    ('Carol Davis', '555-555-5555', '789 Pine Drive', 'carol@example.com'),
    ('David White', '111-222-3333', '123 Maple Lane', 'david@example.com'),
    ('Eve Brown', '999-888-7777', '555 Birch Road', 'eve@example.com');

INSERT INTO appointment (appointment_request, appointment_date, description, id_client, id_place) VALUES
    ('Réunion hebdomadaire', '2023-09-01 10:00:00', 'Discussion des progrès', 1, 1),
    ('Entretien de recrutement', '2023-09-02 15:30:00', 'Rencontre avec le candidat', 2, 3),
    ('Présentation du projet', '2023-09-03 14:00:00', 'Présentation aux investisseurs', 3, 2),
    ('Consultation juridique', '2023-09-04 11:45:00', 'Discussion sur les implications légales', 4, 5),
    ('Réunion d''équipe', '2023-09-05 09:30:00', 'Planification de la prochaine étape', 5, 4);
