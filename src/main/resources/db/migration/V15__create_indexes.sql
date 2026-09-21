CREATE INDEX idx_addresses_user_id
    ON addresses(user_id);

CREATE INDEX idx_carts_user_id
    ON carts(user_id);

CREATE INDEX idx_cart_items_product_id
    ON cart_items(product_id);

CREATE INDEX idx_orders_user_id
    ON orders(user_id);

CREATE INDEX idx_order_items_order_id
    ON order_items(order_id);

CREATE INDEX idx_order_items_product_id
    ON order_items(product_id);

CREATE INDEX idx_payments_order_id
    ON payments(order_id);

CREATE INDEX idx_audit_logs_user_id
    ON audit_logs(user_id);

CREATE INDEX idx_notifications_user_id
    ON notifications(user_id);

CREATE INDEX idx_return_requests_order_id
    ON return_requests(order_id);

CREATE UNIQUE INDEX uq_active_cart_per_user
    ON carts(user_id)
    WHERE status = 'ACTIVE';