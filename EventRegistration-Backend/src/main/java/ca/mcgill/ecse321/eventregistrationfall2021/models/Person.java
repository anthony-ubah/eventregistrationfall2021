package ca.mcgill.ecse321.eventregistrationfall2021.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person{
private String name;
   
   public void setName(String value) {
	   this.name = value;
    }
   @Id
public String getName() {
	   return this.name;
       }
   }