package com.std.entity;

import java.io.Serializable;

public abstract class IdEntity implements Serializable {

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
