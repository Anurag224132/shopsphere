CREATE TABLE cart_items (
                            cart_item_id UUID PRIMARY KEY,
                            cart_id UUID NOT NULL,
                            product_id UUID NOT NULL,
                            quantity INTEGER NOT NULL,
                            created_at TIMESTAMP NOT NULL,
                            updated_at TIMESTAMP NOT NULL,

                            CONSTRAINT chk_cart_item_quantity_positive
                                CHECK (quantity > 0),

                            CONSTRAINT uq_cart_product
                                UNIQUE (cart_id, product_id),

                            CONSTRAINT fk_cart_item_cart
                                FOREIGN KEY (cart_id)
                                    REFERENCES carts(cart_id),

                            CONSTRAINT fk_cart_item_product
                                FOREIGN KEY (product_id)
                                    REFERENCES products(product_id)
);