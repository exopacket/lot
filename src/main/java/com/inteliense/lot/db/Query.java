package com.inteliense.lot.db;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Query {

    private String database;
    private String table;
    private ArrayList<String> select = new ArrayList<String>();
    private ArrayList<String[]> update = new ArrayList<String[]>();

    public Query database(String database) {
        this.database = table;
        return this;
    }

    public Query table(String table) {
        this.table = table;
        return this;
    }

    public Query database(String database, boolean create) {
        this.database = table;
        return this;
    }

    public Query table(String table, boolean create) {
        this.table = table;
        return this;
    }

    public Query select(String... columns) {
        for(String column: columns) {
            select.add(column);
        }
        return this;
    }

    public Query update(String column, String value) {
        return this;
    }

    public Query update(String column, int value) {
        return this;
    }

    public Query update(String column, boolean value) {
        return this;
    }

    public Query update(String column, LocalDateTime value) {
        return this;
    }

    public Query update(String column, LocalDate value) {
        return this;
    }

    public Query delete() {
        return this;
    }

}
