package stym.springboot.jpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stym.springboot.jpaandhibernate.course.Course;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private JdbcRepository jdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        jdbcRepository.insert(new Course(1, "Learn Java", "stymsaw"));
        jdbcRepository.insert(new Course(3, "Learn Mawa", "stymsaw"));
        jdbcRepository.insert(new Course(4, "Learn Kawa", "stymsaw"));
        jdbcRepository.insert(new Course(5, "Learn Gawa", "stymsaw"));

        jdbcRepository.deleteCourseById(1);
    }
}
