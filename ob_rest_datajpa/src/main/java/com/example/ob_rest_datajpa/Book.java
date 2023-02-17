package com.example.ob_rest_datajpa;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Book {
	
	//atributos 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String autor;
	private Integer paginas;
	private Double precio;
	private LocalDate releaseDate;
	private boolean online;
	
	//constructores
	public Book() {
		
	}

	public Book(Long id, String titulo, String autor, Integer paginas, Double precio, LocalDate releaseDate,
			boolean online) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.precio = precio;
		this.releaseDate = releaseDate;
		this.online = online;
	}
	//getter y setter

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
	//toString

	@Override
	public String toString() {
		return "Book [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", precio="
				+ precio + ", releaseDate=" + releaseDate + ", online=" + online + "]";
	}
	

}
