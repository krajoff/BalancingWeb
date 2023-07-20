package com.example.demo.repository;

import com.example.demo.models.Record;

import java.util.ArrayList;
import java.util.List;

public interface Repository {
    public void addRecord(Record record);
    public void updateRecord(Record record);
    public void removeRecord(int id);
    public Record getRecord(int id);
    public List<Record> getRepository();
}
