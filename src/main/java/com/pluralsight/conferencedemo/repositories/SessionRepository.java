package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

// By extending Jpa Repository we inherite from CRUD methods
public interface SessionRepository extends JpaRepository<Session,Long> {
}
