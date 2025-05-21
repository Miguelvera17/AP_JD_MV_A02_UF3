package com.example.iticbcn.mongoAPI.Model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;
import lombok.NoArgsConstructor;

@Document(collection = "students")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
	@Id
	private String id;
	private String name;
	private String lastname1;
	private String lastname2;
	private String gender;
	private String phone;
	private String phone_aux;
	private String birth_year;
}
