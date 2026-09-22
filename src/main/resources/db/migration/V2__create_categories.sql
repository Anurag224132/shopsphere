CREATE TABLE categories (
                            category_id UUID PRIMARY KEY,
                            name VARCHAR(100) NOT NULL,
                            description TEXT,
                            status VARCHAR(30) NOT NULL,
                            created_at TIMESTAMP NOT NULL,
                            updated_at TIMESTAMP NOT NULL
);