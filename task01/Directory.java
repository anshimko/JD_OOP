package by.htp.les10.main.task01;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String name;
	private List<Directory> subdirectory;
	private List<File> files;

	public Directory() {
		name = new String("NewDirectory");
		subdirectory = new ArrayList<Directory>();
		files = new ArrayList<File>();
	}

	public Directory(String name, List<Directory> directory, List<File> files) {

		this.name = name;
		this.subdirectory = directory;
		this.files = files;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Directory> getDirectoryes() {
		return subdirectory;
	}

	public void setDirectoryes(List<Directory> directory) {
		this.subdirectory = directory;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subdirectory == null) ? 0 : subdirectory.hashCode());
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (subdirectory == null) {
			if (other.subdirectory != null)
				return false;
		} else if (!subdirectory.equals(other.subdirectory))
			return false;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public void addTextFile (String name) {
		files.add(new TextFile(name));
	}
	
	public void deleteTextFile (TextFile name) {
		int i = files.indexOf(name);
		files.remove(i);
	}

}
