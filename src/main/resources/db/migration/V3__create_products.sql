CREATE TABLE products (
                          product_id UUID PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          price NUMERIC(19, 2) NOT NULL,
                          sku VARCHAR(100) NOT NULL UNIQUE,
                          description TEXT,
                          status VARCHAR(30) NOT NULL,
                          created_at TIMESTAMP NOT NULL,
                          updated_at TIMESTAMP NOT NULL,

                          CONSTRAINT chk_product_price_non_negative
                              CHECK (price >= 0)
);