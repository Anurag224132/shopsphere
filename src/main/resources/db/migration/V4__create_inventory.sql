CREATE TABLE inventory (
                           inventory_id UUID PRIMARY KEY,
                           product_id UUID NOT NULL UNIQUE,
                           quantity_available INTEGER NOT NULL,
                           quantity_reserved INTEGER NOT NULL,
                           quantity_sold INTEGER NOT NULL,
                           created_at TIMESTAMP NOT NULL,
                           updated_at TIMESTAMP NOT NULL,

                           CONSTRAINT chk_inventory_available_non_negative
                               CHECK (quantity_available >= 0),

                           CONSTRAINT chk_inventory_reserved_non_negative
                               CHECK (quantity_reserved >= 0),

                           CONSTRAINT chk_inventory_sold_non_negative
                               CHECK (quantity_sold >= 0),

                           CONSTRAINT fk_inventory_product
                               FOREIGN KEY (product_id)
                                   REFERENCES products(product_id)
);