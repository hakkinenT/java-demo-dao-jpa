package com.hakkinent.db;

public class DbException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String msg;

    public DbException(String msg) {
        super(msg);
    }
}

