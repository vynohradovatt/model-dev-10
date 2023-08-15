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

INSERT INTO ticket (created_at, client_id , from_planet_id,to_planet_id) VALUES
    ('2023-08-07 12:00:00', 1, 'MRS', 'ER'),
    ( '2023-08-07 12:06:00', 2, 'MRS', 'STR'),
    ('2023-08-07 12:08:00', 3, 'JPTR', 'ER'),
    ('2023-08-07 12:04:40', 4, 'VNS', 'MRS'),
    ('2023-08-07 11:04:00', 5, 'MRS', 'STR'),
    ('2023-08-07 10:00:00', 6, 'MRS', 'VNS'),
    ('2023-08-07 12:58:00', 7, 'MRS', 'ER'),
    ('2023-08-07 12:59:00', 8, 'MRS', 'ER'),
    ('2023-08-07 13:01:00', 9, 'MRS', 'ER'),
    ('2023-08-07 13:04:00', 10, 'MRS', 'ER');
