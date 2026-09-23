-- V16__align_entities_with_migrations.sql

-- AuditLog.entityId is now nullable = false in the entity
ALTER TABLE audit_logs
    ALTER COLUMN entity_id SET NOT NULL;

-- ReturnRequest.refundStatus is nullable = false in the entity
ALTER TABLE return_requests
    ALTER COLUMN refund_status SET NOT NULL;

-- Category.java now declares @UniqueConstraint on name — the entity
-- says it's unique, but nothing in the DB enforces it yet
ALTER TABLE categories
    ADD CONSTRAINT uk_categories_name UNIQUE (name);

CREATE UNIQUE INDEX ux_payment_one_success_per_order
    ON payments(order_id) WHERE status = 'SUCCESS';