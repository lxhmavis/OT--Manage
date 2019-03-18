package com.lxh.aweb.entity;

public class User {
    
    private String id;
    
    private String name;
    
    private Long workNumber;
    
    private String sex;
    
    public User() {
        super();
    }
    
    public User(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getWorkNumber() {
		return workNumber;
	}
	public void setWorkNumber(Long workNumber) {
		this.workNumber = workNumber;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", workNumber="
                + workNumber + ", sex=" + sex + "]";
    }
	
}
