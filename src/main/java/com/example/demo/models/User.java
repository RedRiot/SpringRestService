package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "User")
@ApiModel(description = "All details about the user. ")
public class User {
    @GeneratedValue
    private int id;
    @ApiModelProperty(notes ="Name should be at least two characters")
    @Size(min = 2, message = "Name should be at least two characters")
    private String name;
    //static filtering
    @JsonIgnore
    private Date date;

    public User() {
    }

    public User(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
