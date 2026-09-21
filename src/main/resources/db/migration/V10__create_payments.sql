CREATE TABLE payments (
                          payment_id UUID PRIMARY KEY,
                          order_id UUID NOT NULL,
                          attempt_number INTEGER NOT NULL,
                          idempotency_key VARCHAR(255),
                          amount NUMERIC(19, 2) NOT NULL,
                          currency VARCHAR(10) NOT NULL,
                          payment_method VARCHAR(30) NOT NULL,
                          status VARCHAR(30) NOT NULL,
                          transaction_reference VARCHAR(255),
                          created_at TIMESTAMP NOT NULL,
                          updated_at TIMESTAMP NOT NULL,

                          CONSTRAINT chk_payment_attempt_positive
                              CHECK (attempt_number > 0),

                          CONSTRAINT chk_payment_amount_positive
                              CHECK (amount > 0),

                          CONSTRAINT uq_payment_attempt
                              UNIQUE (order_id, attempt_number),

                          CONSTRAINT fk_payment_order
                              FOREIGN KEY (order_id)
                                  REFERENCES orders(order_id)
);