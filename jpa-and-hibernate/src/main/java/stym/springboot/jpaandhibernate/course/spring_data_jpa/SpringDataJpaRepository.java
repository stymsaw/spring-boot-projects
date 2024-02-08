package stym.springboot.jpaandhibernate.course.spring_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import stym.springboot.jpaandhibernate.course.Course;

import java.util.List;

public interface SpringDataJpaRepository extends JpaRepository<Course, Long> {


    List<Course> findByAuthor(String author);

}
