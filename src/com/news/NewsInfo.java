package com.news;

public class NewsInfo {
	private int newsId;
	private String newsTitle;
	private String newsContent;
	private String newsDate;

	//get和set方法
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public String getNewsDate() {
		return newsDate;
	}
	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}

	//构造方法
	public NewsInfo(int newsId2, String newsTitle, String newsContent,
			String newsDate) {
		super();
		this.newsId = newsId2;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.newsDate = newsDate;
	}
	public NewsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
