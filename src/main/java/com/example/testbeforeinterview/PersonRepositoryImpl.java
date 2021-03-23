package com.example.testbeforeinterview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PersonRepositoryImpl implements PersonRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonRepository.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Person> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Person findOne(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Person save(Person person) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int delete(String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
