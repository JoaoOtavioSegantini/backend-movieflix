package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	@NotBlank(message = "Não é permitido inserir texto vazio na avaliação")
	private String text;
	
	private Movie movie;
	
	private Long movieId;
	
	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text, Long movieId) {

		this.id = id;
		this.text = text;
		this.movieId = movie.getId();
	}
	
	public ReviewDTO(Review entity) {

		this.id = entity.getId();
		this.text = entity.getText();
		this.movieId = entity.getMovie().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	
	

}
