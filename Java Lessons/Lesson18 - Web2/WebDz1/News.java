
public class News {

	public String title;

	public String body;

	public String created;

	public String author;
	
	public News( ) {
		
	}

	public News(String title, String body, String created, String author) {
		this.title = title;
		this.body = body;
		this.created = created;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public String getCreated() {
		return created;
	}

	public String getAuthor() {
		return author;
	}

	public String toString() {
		return title + "," + body + "," + created + "," + author;
	}
}
