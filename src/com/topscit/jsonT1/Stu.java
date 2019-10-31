package com.topscit.jsonT1;

import java.util.List;

public class Stu {
	
	private String name;
	private String sex;
	private Integer age;
	private List<Friend> friends;
	private Relative relative;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public List<Friend> getFriends() {
		return friends;
	}
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
	public Relative getRelative() {
		return relative;
	}
	public void setRelative(Relative relative) {
		this.relative = relative;
	}

}
