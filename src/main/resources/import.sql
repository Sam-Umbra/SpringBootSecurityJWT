-- Insere o usuário na tabela 'users'
INSERT INTO users (email, password) VALUES ('user@example.com', '$2a$10$Ybt6SHcLb9c1MiJQd2.NMume7LnR97m17qibboaVLHGaoh26fD2oO');

-- Supomos que o ID do usuário inserido seja 1, ajuste conforme necessário
-- Insere as roles do usuário na tabela 'user_roles'
INSERT INTO user_roles (user_id, role) VALUES (1, 'ROLE_USER');

-- Insere o usuário admin na tabela 'users'
INSERT INTO users (email, password) VALUES ('admin@example.com', '$2a$10$Ybt6SHcLb9c1MiJQd2.NMume7LnR97m17qibboaVLHGaoh26fD2oO');

-- Suponha que o ID gerado automaticamente para o admin seja 2 (ajuste se necessário)
-- Insere a role 'ROLE_ADMIN' para o admin
INSERT INTO user_roles (user_id, role) VALUES (2, 'ROLE_ADMIN');

-- senha123 para todos