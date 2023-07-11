package com.intensivao.dslist.dto;

import com.intensivao.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Game entity) {
		this.setId(entity.getId());
		this.setTitle(entity.getTitle());
		this.setYear(entity.getYear());
		this.setImgUrl(entity.getImgUrl());
		this.setShortDescription(entity.getShortDescription());
	}
	
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getYear() {
		return this.year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public String getImgUrl() {
		return this.imgUrl;
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public String getShortDescription() {
		return this.shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	
	
	
	
	

}
