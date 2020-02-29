package com.youtubechannel;

public class Video {
	
	private String title;
	private String author;
	private String details;
			
	public Video(String title, String author, String details) {
		super();
		this.title = title;
		this.author = author;
		this.details = details;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "Video [title=" + title + ", author=" + author + ", details=" + details + "]";
	}
	
}
