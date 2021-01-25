package org.example.borrowing.repos;

import org.example.borrowing.models.Borrowing;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowingRepository extends MongoRepository<Borrowing, String> {
}
