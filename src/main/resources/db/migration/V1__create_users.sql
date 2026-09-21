CREATE TABLE users (
                       user_id UUID PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       password_hash VARCHAR(255) NOT NULL,
                       mobile_number VARCHAR(20) UNIQUE,
                       role VARCHAR(30) NOT NULL,
                       status VARCHAR(30) NOT NULL,
                       created_at TIMESTAMP NOT NULL,
                       updated_at TIMESTAMP NOT NULL
);