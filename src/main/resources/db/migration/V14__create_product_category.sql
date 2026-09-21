CREATE TABLE product_category (
                                  product_id UUID NOT NULL,
                                  category_id UUID NOT NULL,

                                  PRIMARY KEY (product_id, category_id),

                                  CONSTRAINT fk_product_category_product
                                      FOREIGN KEY (product_id)
                                          REFERENCES products(product_id),

                                  CONSTRAINT fk_product_category_category
                                      FOREIGN KEY (category_id)
                                          REFERENCES categories(category_id)
);