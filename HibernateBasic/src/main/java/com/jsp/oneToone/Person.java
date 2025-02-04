package com.jsp.oneToone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
	
@Column (nullable =false)
private String name;

@Column (unique = true)
private long mobilenumber;

@OneToOne(mappedBy = "person")
private Pan pan;

public int getId() {
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

public long getMobilenumber() {
	return mobilenumber;
}

public void setMobilenumber(long mobilenumber) {
	this.mobilenumber = mobilenumber;
}

public Pan getPan() {
	return pan;
}

public void setPan(Pan pan) {
	this.pan = pan;
}

}
