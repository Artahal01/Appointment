CREATE TABLE place (
    id_place SERIAL PRIMARY KEY,
    place_name VARCHAR(255) NOT NULL,
    address VARCHAR(255)
);

CREATE TABLE client (
    id_client SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20),
    address VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE appointment (
    id_appointment SERIAL PRIMARY KEY,
    appointment_request VARCHAR(255),
    appointment_date TIMESTAMP,
    description TEXT,
    id_client INT REFERENCES client(id_client),
    id_place INT REFERENCES place(id_place)
);
