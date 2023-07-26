package com.example.balancing.services;

import com.example.balancing.models.Record;
import com.example.balancing.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RecordService {
    private final RecordRepository recordRepository;

    public List<Record> getRecords(String mode) {
        if (mode != null) return recordRepository.findByMode(mode);
        return recordRepository.findAll();
    }

    public void saveRecord(Record record) {
        log.info("Saving a new record {}", record);
        recordRepository.save(record);
    }

    public void deleteRecord(Integer id) {
        log.info("Removed the record {}", id);
        recordRepository.deleteById(id);
    }

    public Record getRecordById(Integer id) {
        return recordRepository.findById(id).orElse(null);
    }

}
