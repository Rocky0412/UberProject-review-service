ALTER TABLE course_students
DROP
FOREIGN KEY FK51gqjmktqx2rhem5up0rqfff0;

ALTER TABLE course_students
DROP
FOREIGN KEY FKgut5xj4l8sk6hg3l0t2su2pnc;

ALTER TABLE booking
DROP
FOREIGN KEY FKh1stionm0jgsyfg7fv98trhjj;

ALTER TABLE booking_review
    ADD booking_id BIGINT NULL;

ALTER TABLE booking_review
    ADD CONSTRAINT FK_BOOKING_REVIEW_ON_BOOKING FOREIGN KEY (booking_id) REFERENCES booking (id);

