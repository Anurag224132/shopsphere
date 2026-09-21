CREATE TABLE carts (
                       cart_id UUID PRIMARY KEY,
                       user_id UUID NOT NULL,
                       status VARCHAR(30) NOT NULL,
                       created_at TIMESTAMP NOT NULL,
                       updated_at TIMESTAMP NOT NULL,

                       CONSTRAINT fk_cart_user
                           FOREIGN KEY (user_id)
                               REFERENCES users(user_id)
);