package com.jh.dto;

public class BoardDTO {
	private int bno;
	private String writer;
	private String title;
	private String content;
	private int hitcount;
	private String writedate;
	
	// 이게없으면 SQLEXCEPTION 뜸
	public BoardDTO() {}

	public BoardDTO(int bno, String writer, String title, String content, int hitcount, String writedate) {
		this.bno = bno;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.hitcount = hitcount;
		this.writedate = writedate;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getHitcount() {
		return hitcount;
	}

	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	
	
	
}
