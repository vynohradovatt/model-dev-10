CREATE TABLE IF NOT EXISTS client(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR (200) NOT NULL CHECK (LENGTH(name) > 3 AND LENGTH(name) <=200)
);

CREATE TABLE planet (
    id VARCHAR(100) PRIMARY KEY,
    name VARCHAR(500) NOT NULL CHECK (LENGTH(name) > 1 AND LENGTH(name) <500),
    CONSTRAINT id_format CHECK (id REGEXP '^[A-Z0-9]+$')
);

CREATE TABLE ticket (
    id IDENTITY PRIMARY KEY,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP AT TIME ZONE 'UTC',
    client_id INTEGER,
    from_planet_id VARCHAR NOT NULL,
    to_planet_id VARCHAR NOT NULL,
    CONSTRAINT client_id FOREIGN KEY (client_id) REFERENCES client (id),
    CONSTRAINT from_planet_id FOREIGN KEY (from_planet_id) REFERENCES planet (id),
    CONSTRAINT to_planet_id FOREIGN KEY (to_planet_id) REFERENCES planet (id)
);