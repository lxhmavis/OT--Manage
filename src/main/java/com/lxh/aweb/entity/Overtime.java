package com.lxh.aweb.entity;

import java.util.Date;

public class Overtime {
    
	private Integer id;
	
	private Date overTime; 
	
	private String reason;
	
	private Long interval;
	
	private Float time;
	
	private String comments;
	
	private User user;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getOverTime() {
		return overTime;
	}
	public void setOverTime(Date overTime) {
		this.overTime = overTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Long getInterval() {
		return interval;
	}
	public void setInterval(Long interval) {
		this.interval = interval;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
	
}
