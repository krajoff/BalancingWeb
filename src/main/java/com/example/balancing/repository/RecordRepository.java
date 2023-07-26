package com.example.balancing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.balancing.models.Record;

import java.util.List;

public interface RecordRepository extends JpaRepository<Record, Integer> {
    List<Record> findByMode(String mode);

}
