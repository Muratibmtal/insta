package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="instagram")
public class İnstagramentity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name=" numberofposts")
	private int numberofposts;
	@Column(name="likes")
	private int likes;
	@Column(name="comment")
	private int comment;
	public İnstagramentity() {
		super();
	}
	public İnstagramentity(int id, int numberofposts, int likes, int comment) {
		super();
		this.id = id;
		this.numberofposts = numberofposts;
		this.likes = likes;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberofposts() {
		return numberofposts;
	}
	public void setNumberofposts(int numberofposts) {
		this.numberofposts = numberofposts;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
}
