package com.example.ob_rest_datajpa;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObRestDatajpaApplication {

	
	
	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		 BookRepository repository = context.getBean(BookRepository.class);
		 
		 
		 //Crud
		 // crear libro
		 Book book1 = new Book(null,"Homo Deus","Yuval Noah",450,29.99,LocalDate.of(2018, 12, 1),true);
		 Book book2 = new Book(null,"Homo Sapiens","Yuval Noah",450,19.99,LocalDate.of(2013, 12, 1),true);
		 //almacenar un libro
		 System.out.println("Num libros en base de datos: " + repository.findAll().size());
		 
		 repository.save(book1);
		 repository.save(book2);
		 
		 //recuperar todos los libros
		 System.out.println("Num libros en base de datos: " + repository.findAll().size());
		 
		 //System.out.println("Libro por id: " + repository.findOne(null));
		 
		 //borrar un libro
		 repository.deleteById(1L);
		 
		 System.out.println("Num libros en base de datos (libro borrado por el delete: " + repository.findAll().size());
		 
	}

}
