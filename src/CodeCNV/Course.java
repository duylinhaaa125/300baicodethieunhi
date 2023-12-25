package CodeCNV;

import java.util.List;

public class Course {
	public long Id;
	public String Name;
	public long ParentId;
	public List<Course> childrent;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getParentId() {
		return ParentId;
	}

	public void setParentId(long parentId) {
		ParentId = parentId;
	}

	
	
	public List<Course> getChildrent() {
		return childrent;
	}

	public void setChildrent(List<Course> childrent) {
		this.childrent = childrent;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", Name=" + Name + ", ParentId=" + ParentId + "]";
	}

	
	

}
