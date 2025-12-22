-- 1. Drop old foreign key on booking.review_id
ALTER TABLE booking
DROP FOREIGN KEY FK_BOOKING_ON_REVIEW;

-- 2. Drop old review_id column
ALTER TABLE booking
DROP COLUMN review_id;

-- 3. Add booking_id column to booking_review (1:1 relationship)
ALTER TABLE booking_review
ADD COLUMN booking_id BIGINT UNIQUE;

-- 4. Add foreign key constraint: booking_review.booking_id → booking.id
ALTER TABLE booking_review
ADD CONSTRAINT FK_BOOKING_REVIEW_ON_BOOKING
FOREIGN KEY (booking_id) REFERENCES booking(id)
ON DELETE CASCADE;
