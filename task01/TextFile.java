package by.htp.les10.main.task01;

public class TextFile extends File {

	private String content;

	public TextFile() {
		super();
		content = new String("");
	}
	
	public TextFile(String name) {
		super(name);
		content = new String("");
	}

	public TextFile(String name, String content) {
		super(name);
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TextFile [getName()=" + getName() + ", content=" + content + "]";
	}
	
	public void addContent (String str) {
		this.content = this.content.concat(str);
	}
	
	public void deleteContent () {
		this.setContent("");
	}

}
