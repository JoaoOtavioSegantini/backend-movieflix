package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Review;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String text;
		
	private Long movieId;
	
	private String username;
	
	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text, Long movieId, String username) {

		this.id = id;
		this.text = text;
		this.movieId = movieId;
		this.username = username;
	}
	
	public ReviewDTO(Review entity) {

		this.id = entity.getId();
		this.text = entity.getText();
		this.movieId = entity.getMovie().getId();
		this.username = entity.getUser().getName();
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


	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	

}