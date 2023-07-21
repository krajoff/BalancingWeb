package com.example.balancing.repository;

import com.example.balancing.models.Record;

import java.util.List;

public interface Repository {
    public void addRecord(Record record);
    public void updateRecord(Record record);
    public void removeRecord(int id);
    public Record getRecord(int id);
    public List<Record> getRepository();
}
