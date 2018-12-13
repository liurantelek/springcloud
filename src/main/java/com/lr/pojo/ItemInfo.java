package com.lr.pojo;


import java.io.Serializable;

public class ItemInfo implements Serializable {
    private Long id;
    private String name;
    private String desription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    public ItemInfo(Long id,String name,String desription){
        this.id=id;
        this.name=name;
        this.desription=desription;
    }

    public ItemInfo() {
    }
}
