CREATE TABLE addresses (
                           address_id UUID PRIMARY KEY,
                           user_id UUID NOT NULL,
                           name VARCHAR(100) NOT NULL,
                           phone_number VARCHAR(20) NOT NULL,
                           address_line1 VARCHAR(255) NOT NULL,
                           address_line2 VARCHAR(255),
                           landmark VARCHAR(255),
                           pincode VARCHAR(20) NOT NULL,
                           city VARCHAR(100) NOT NULL,
                           state VARCHAR(100) NOT NULL,
                           country VARCHAR(100) NOT NULL,
                           address_type VARCHAR(30) NOT NULL,
                           created_at TIMESTAMP NOT NULL,
                           updated_at TIMESTAMP NOT NULL,

                           CONSTRAINT fk_address_user
                               FOREIGN KEY (user_id)
                                   REFERENCES users(user_id)
);