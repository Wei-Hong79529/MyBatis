package com.Jack.MyBatis.Pojo;

public class PosRole {
    private Integer posId;
    private Integer role;
    private String  name;
    public PosRole(Integer posId, Integer role, String name) {
        this.posId = posId;
        this.role = role;
        this.name = name;
    }
    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Integer getRole() {
        return role;
    }


    public void setRole(Integer role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
