package com.example.demo.services;

import com.example.demo.models.Record;
import com.example.demo.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RecordService {
    private RecordRepository recordRepository;

    public List<Record> getRecords(String mode) {
        if (mode != null) recordRepository.findByMode(mode);
        return recordRepository.findAll();
    }

    public void saveRecord(Record record) {
        log.info("Adding new {}", record);
        recordRepository.save(record);
    }

    public void deleteRecord(Integer id) {
        recordRepository.deleteById(id);
    }

    public Record getRecordById(Integer id) {
        return recordRepository.findById(id).orElse(null);
    }

}
