package com.lxh.aweb.entity;

import java.util.Date;

/**
 * 
 * ClassName:Offtime <br/>
 * date:2019年3月18日 下午4:05:55 <br/>
 *
 * @author LXH
 * @version 
 * @since JDK 1.8
 */
public class Offtime {
	
	private Integer id;
	
	private Date useDate;
	
	private float userHour;
	
	private String comments;
	
	private User user;
	
	public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
		this.id = id;
	}
	public Date getUseDate() {
		return useDate;
	}
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}
	public float getUserHour() {
		return userHour;
	}
	public void setUserHour(float userHour) {
		this.userHour = userHour;
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
    
    @Override
    public String toString() {
        return "Offtime [id=" + id + ", useDate=" + useDate + ", userHour="
                + userHour + ", comments=" + comments + ", user=" + user + "]";
    }
	
}
