package com.intensivao.dslist.entities;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	
	public Game() {
		
	}
	
	public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl, String shortDescription,
			String longDescription) {
		
		this.setId(id);
		this.setTitle(title);
		this.setYear(year);
		this.setGenre(genre);
		this.setPlatform(platform);
		this.setImgUrl(imgUrl);
		this.setShortDescription(shortDescription);
		this.setLongDescription(longDescription);
		
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
	
	public String getGenre() {
		return this.genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getPlatform() {
		return this.platform;
	}
	
	public void setPlatform(String platform) {
		this.platform = platform;
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
	
	public String getLongDescription() {
		return this.longDescription;
	}
	
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (this == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
