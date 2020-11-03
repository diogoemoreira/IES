

package pt.lab2_3.SpringBoot;

public class GreetingRest {

	private final long id;
	private final String content;

	public GreetingRest(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}