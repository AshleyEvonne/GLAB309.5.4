package com.example.GLAB30954.model;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employee {
    private long id;
    private String name;
    private String contactNumber;

    public String getcontactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }
    public Employee(long id, String name){
        this.id = id;
        this.name = name;
    }
    public long getid(){
        return id;
    }
    public void setid(long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //Standard getters and setters removed
}
