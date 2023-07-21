package com.example.balancing.repository;

import com.example.balancing.models.Record;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@org.springframework.stereotype.Repository
public class RepImp implements Repository {
    private static final Logger logger = LoggerFactory.getLogger(RepImp.class);

    private SessionFactory sessionFactory;

    @Override
    public void addRecord(Record record) {

    }

    @Override
    public void updateRecord(Record record) {

    }

    @Override
    public void removeRecord(int id) {

    }

    @Override
    public Record getRecord(int id) {
        return null;
    }

    @Override
    public List<Record> getRepository() {
        return null;
    }
}
