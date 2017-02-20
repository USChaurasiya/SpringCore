package com.uma.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * Employee DTO Class Containing all info related to employee.. This class is an Entity Class.
 * @author um@.
 *
 */
@Entity
public class Employee implements Serializable
{
	@Id
	 @GeneratedValue
	 private int id;

	 @Column(name = "first_name")
	 private String firstName;

	 @Column(name = "last_name")
	 private String lastName;

	 private String email;
	 private String phone;

	 
	 public Employee() {
		// TODO Auto-generated constructor stub
	}
	 public int getId() {
	  return id;
	 }

	 public void setId(int id) {
	  this.id = id;
	 }

	 public String getFirstName() {
	  return firstName;
	 }

	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }

	 public String getLastName() {
	  return lastName;
	 }

	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }

	 public String getEmail() {
	  return email;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }

	 public String getPhone() {
	  return phone;
	 }

	 public void setPhone(String phone) {
	  this.phone = phone;
	 }

}
