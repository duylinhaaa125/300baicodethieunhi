package CodeCNV;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		Student a = new Student();
//		Student b = a;
//		
//		a.setName("An");
//		b.setName("Binh");
//		
//		System.out.println(a.getName());
//		System.out.println(b.getName());

		TheirCourse vanCourse = new TheirCourse();
		vanCourse.setId(1);
		vanCourse.setName("Toan");

		TheirCourse hoaCourse = new TheirCourse();
		hoaCourse.setId(2);
		hoaCourse.setName("Hoa");

		TheirCourse hoaHuuCoCourse = new TheirCourse();
		
		List<TheirCourse> list = new ArrayList<TheirCourse>();

		list.add(hoaCourse);
		list.add(vanCourse);

		TheirCourse theirCourse = new TheirCourse();
		theirCourse.setId(0);
		theirCourse.setName("CNV");

		theirCourse.setChildren(list);
		
		List<TheirCourse> list1 = new ArrayList<TheirCourse>();

		list1.add(theirCourse);
		
		System.out.println(list1.toString());

		List<Course> listCourse = fromTheirCourses(list1);

		System.out.println(listCourse.toString());
		
	}

	public static List<Course> fromTheirCourses(List<TheirCourse> theirCourses) {
//		
//		List<Course> result = new ArrayList<Course>();
//		for (TheirCourse theirCourse : theirCourses) {
//			List<TheirCourse> children = theirCourse.getChildren();
//			if(children != null) {
//				for (TheirCourse child : children) {
//					Course course = new Course();
//					course.setId(child.Id);
//					course.setName(child.Name);
//					course.setParentId(theirCourse.getId());
//					result.add(course);
//				}
//				
//			}
//			
//		}
//		return result;
		 List<Course> courses = new ArrayList<>();

	        for (TheirCourse theirCourse : theirCourses) {
	            Course course = new Course();
	            course.setId(theirCourse.getId());
	            course.setName(theirCourse.getName());

	            if (theirCourse.getChildren() != null && !theirCourse.getChildren().isEmpty()) {
	                course.setChildrent(fromTheirCourses(theirCourse.getChildren()));
	            }

	            courses.add(course);
	        }

	        return courses;
	}

}
