CREATE TABLE orders (
                        order_id UUID PRIMARY KEY,
                        user_id UUID NOT NULL,
                        status VARCHAR(30) NOT NULL,
                        currency VARCHAR(10) NOT NULL,
                        total_amount NUMERIC(19, 2) NOT NULL,

                        shipping_name VARCHAR(100) NOT NULL,
                        shipping_phone_number VARCHAR(20) NOT NULL,
                        shipping_address_line1 VARCHAR(255) NOT NULL,
                        shipping_address_line2 VARCHAR(255),
                        shipping_landmark VARCHAR(255),
                        shipping_city VARCHAR(100) NOT NULL,
                        shipping_state VARCHAR(100) NOT NULL,
                        shipping_country VARCHAR(100) NOT NULL,
                        shipping_pincode VARCHAR(20) NOT NULL,

                        created_at TIMESTAMP NOT NULL,
                        updated_at TIMESTAMP NOT NULL,

                        CONSTRAINT chk_order_total_non_negative
                            CHECK (total_amount >= 0),

                        CONSTRAINT fk_order_user
                            FOREIGN KEY (user_id)
                                REFERENCES users(user_id)
);