-- Table pour les dons
CREATE TABLE donation (
                          id SERIAL PRIMARY KEY,
                          email VARCHAR(255) NOT NULL,
                          full_name VARCHAR(255) NOT NULL,
                          date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                          amount DECIMAL(10, 2) NOT NULL,
                          payment_method VARCHAR(50) NOT NULL,
                          status VARCHAR(20) NOT NULL DEFAULT 'VERIFYING',
                          vola_id VARCHAR(255)
);

-- Table pour les aides
CREATE TABLE help (
                      id SERIAL PRIMARY KEY,
                      email VARCHAR(255) NOT NULL,
                      full_name VARCHAR(255) NOT NULL,
                      date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                      amount DECIMAL(10, 2) NOT NULL,
                      payment_method VARCHAR(50) NOT NULL,
                      accident_description TEXT NOT NULL
);

-- Données de test pour preprod
INSERT INTO donation (email, full_name, date, amount, payment_method, status, vola_id)
VALUES
    ('test1@example.com', 'Jean Dupont', '2023-01-01 10:00:00', 50.00, 'CARD', 'SUCCEEDED', 'vola_123'),
    ('test2@example.com', 'Marie Martin', '2023-01-02 11:00:00', 30.00, 'MOBILE_MONEY', 'FAILED', 'vola_456'),
    ('test3@example.com', 'Pierre Durand', CURRENT_TIMESTAMP, 20.00, 'CARD', 'VERIFYING', 'vola_789');

INSERT INTO help (email, full_name, date, amount, payment_method, accident_description)
VALUES
    ('victim1@example.com', 'Lucie Lambert', '2023-01-01 09:00:00', 200.00, 'BANK_TRANSFER', 'Accident de voiture'),
    ('victim2@example.com', 'Thomas Moreau', '2023-01-05 14:00:00', 150.00, 'CARD', 'Incendie domestique');