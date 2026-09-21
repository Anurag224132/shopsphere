CREATE TABLE return_requests (
                                 return_request_id UUID PRIMARY KEY,
                                 order_id UUID NOT NULL,
                                 reason TEXT NOT NULL,
                                 status VARCHAR(30) NOT NULL,
                                 requested_at TIMESTAMP NOT NULL,
                                 processed_at TIMESTAMP,
                                 refund_status VARCHAR(30),

                                 CONSTRAINT fk_return_request_order
                                     FOREIGN KEY (order_id)
                                         REFERENCES orders(order_id)
);