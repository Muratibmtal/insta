package ibmtal.com.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="news")
public class News {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="contentlocation")
	private String contentlocation;
	@Column(name="contentname")
	private String contentname;
	@Column(name="newsplace")
	private String newsplace;
	public News() {
		super();
	}
	public News(int id, String contentlocation, String contentname, String newsplace) {
		super();
		this.id = id;
		this.contentlocation = contentlocation;
		this.contentname = contentname;
		this.newsplace = newsplace;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContentlocation() {
		return contentlocation;
	}
	public void setContentlocation(String contentlocation) {
		this.contentlocation = contentlocation;
	}
	public String getContentname() {
		return contentname;
	}
	public void setContentname(String contentname) {
		this.contentname = contentname;
	}
	public String getNewsplace() {
		return newsplace;
	}
	public void setNewsplace(String newsplace) {
		this.newsplace = newsplace;
	}
	
}
