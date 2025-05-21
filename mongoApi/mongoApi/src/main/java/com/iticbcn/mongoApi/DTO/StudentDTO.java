package com.iticbcn.mongoApi.DTO;

public record StudentDTO(

     String id,
	 String name,
	 String lastname1,
	 String lastname2,
	 String gender,
	 String email,
	 String phone,
	 String phone_aux,
	 String birth_year
) {}