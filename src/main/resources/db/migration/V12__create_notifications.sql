CREATE TABLE notifications (
                               notification_id UUID PRIMARY KEY,
                               user_id UUID NOT NULL,
                               type VARCHAR(50) NOT NULL,
                               title VARCHAR(255) NOT NULL,
                               message TEXT NOT NULL,
                               status VARCHAR(30) NOT NULL,
                               channel VARCHAR(30) NOT NULL,
                               reference_type VARCHAR(100),
                               reference_id UUID,
                               sent_at TIMESTAMP,
                               created_at TIMESTAMP NOT NULL,
                               updated_at TIMESTAMP NOT NULL,

                               CONSTRAINT fk_notification_user
                                   FOREIGN KEY (user_id)
                                       REFERENCES users(user_id)
);