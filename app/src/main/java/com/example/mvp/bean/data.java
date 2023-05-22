package com.example.mvp.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class data {
    @Id
    private Long id;
    private String name;
    @Generated(hash = 13743062)
    public data(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 288655944)
    public data() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
