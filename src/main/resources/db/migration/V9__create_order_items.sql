CREATE TABLE order_items (
                             order_item_id UUID PRIMARY KEY,
                             order_id UUID NOT NULL,
                             product_id UUID NOT NULL,
                             quantity INTEGER NOT NULL,
                             unit_price NUMERIC(19, 2) NOT NULL,
                             total_price NUMERIC(19, 2) NOT NULL,

                             CONSTRAINT chk_order_item_quantity_positive
                                 CHECK (quantity > 0),

                             CONSTRAINT chk_order_item_unit_price_non_negative
                                 CHECK (unit_price >= 0),

                             CONSTRAINT chk_order_item_total_price_non_negative
                                 CHECK (total_price >= 0),

                             CONSTRAINT fk_order_item_order
                                 FOREIGN KEY (order_id)
                                     REFERENCES orders(order_id),

                             CONSTRAINT fk_order_item_product
                                 FOREIGN KEY (product_id)
                                     REFERENCES products(product_id)
);