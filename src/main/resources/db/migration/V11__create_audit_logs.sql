CREATE TABLE audit_logs (
                            audit_log_id UUID PRIMARY KEY,
                            user_id UUID,
                            action VARCHAR(100) NOT NULL,
                            entity_type VARCHAR(100) NOT NULL,
                            entity_id UUID,
                            description TEXT,
                            timestamp TIMESTAMP NOT NULL,
                            ip_address VARCHAR(45),

                            CONSTRAINT fk_audit_log_user
                                FOREIGN KEY (user_id)
                                    REFERENCES users(user_id)
);