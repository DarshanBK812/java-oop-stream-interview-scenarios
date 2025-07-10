package Student_Management_System;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Colleuage {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Darshan", 1, 275), new Student("chandu", 2, 150),
				new Student("Maha", 3, 155), new Student("Varsha", 4, 290));

		// 1. To calculate average marks
//		System.out.println(students.stream().mapToDouble(Student::getStduentMarks).sum() / students.stream().count());

//		2.Find topper of the class
//		Optional<Object> name2 = students.stream().sorted(Comparator.comparing(Student::getStduentMarks).reversed())
//				.findFirst().map(name -> name.getStudentName());
//		System.out.println(name2.get());

// 		3.Find topper of the class
//		System.out.println(students.stream().sorted((a, b) -> a.getStduentMarks() - b.getStduentMarks()).findFirst()
//				.map(student -> student.getStudentName()).get());

		// 4.Count students with marks > 75%

//		int count = 0;  using collection
//		List<Student> list = new ArrayList<Student>();
//		for (Student student : students) {
//			if (student.getStduentMarks() <= (300 * 75) / 100) {
//				count++;
//				list.add(student);
//			}
//
//		}
//		list.stream().map(student -> student.getStudentName()).forEach(System.out::println);
//		System.out.println(students.stream().filter(student -> student.getStduentMarks() <= (300*75)/100).map(student -> student.getStudentName()).toList());

	}

}
