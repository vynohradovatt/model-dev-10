INSERT INTO client (name) VALUES
    ('Bill'),
    ('Ross'),
    ('Peter'),
    ('Mary'),
    ('Monica'),
    ('John'),
    ('Nina'),
    ('Anna'),
    ('Tanya'),
    ('Mark');

INSERT INTO planet (id, name) VALUES
    ('MRS', 'Mars'),
    ('VNS', 'Venus'),
    ('ER', 'Earth'),
    ('JPTR', 'Jupiter'),
    ('STR', 'Saturn');

INSERT INTO ticket (id, created_at, client_id , from_planet_id,to_planet_id) VALUES
    (1, '2023-08-07 12:00:00', 1, 'MRS', 'ER'),
    (2, '2023-08-07 12:06:00', 2, 'MRS', 'STR'),
    (3, '2023-08-07 12:08:00', 3, 'JPTR', 'ER'),
    (4, '2023-08-07 12:04:40', 4, 'VNS', 'MRS'),
    (5, '2023-08-07 11:04:00', 5, 'MRS', 'STR'),
    (6, '2023-08-07 10:00:00', 6, 'MRS', 'VNS'),
    (7, '2023-08-07 12:58:00', 7, 'MRS', 'ER'),
    (8, '2023-08-07 12:59:00', 8, 'MRS', 'ER'),
    (9, '2023-08-07 13:01:00', 9, 'MRS', 'ER'),
    (10, '2023-08-07 13:04:00', 10, 'MRS', 'ER');
