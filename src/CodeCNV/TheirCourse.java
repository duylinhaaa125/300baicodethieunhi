package CodeCNV;

import java.util.List;

public class TheirCourse {
	  public long Id;
      public String Name;
      public List<TheirCourse> Children;
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
	public List<TheirCourse> getChildren() {
		return Children;
	}
	public void setChildren(List<TheirCourse> children) {
		Children = children;
	}
	@Override
	public String toString() {
		return "TheirCourse [Id=" + Id + ", Name=" + Name + ", Children=" + Children + "]";
	}
      
      
}
