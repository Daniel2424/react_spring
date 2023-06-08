package com.sergio.jwt.backend.repositories;

import com.sergio.jwt.backend.entites.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
