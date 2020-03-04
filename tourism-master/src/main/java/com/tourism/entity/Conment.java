package com.tourism.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conment")
public class Conment extends BaseEntity {
    //关联景区ID
    @Column(name= "scenery_id")
    private String sceneryId;

    //名称
    @Column(name= "name")
    private String name;

    //内容
    @Column(name= "conment")
    private String conment;

    public String getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(String sceneryId) {
        this.sceneryId = sceneryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConment() {
        return conment;
    }

    public void setConment(String conment) {
        this.conment = conment;
    }
}
