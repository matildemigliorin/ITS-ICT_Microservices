package org.example.book.service;

import brave.Span;
import brave.Tracer;
import org.springframework.stereotype.Service;

@Service
public class TraceService {
    Tracer tracer;

    public TraceService(Tracer tracer) {
        this.tracer = tracer;
    }

    public String getTraceId() {
        Span span = tracer.currentSpan();
        String traceId = span.context().traceIdString();
        return traceId;
    }
}import org.example.book.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
