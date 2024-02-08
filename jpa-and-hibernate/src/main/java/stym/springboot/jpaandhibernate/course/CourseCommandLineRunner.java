package stym.springboot.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stym.springboot.jpaandhibernate.course.Course;
import stym.springboot.jpaandhibernate.course.jdbc.JdbcRepository;
import stym.springboot.jpaandhibernate.course.jpa.JpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private JdbcRepository jdbcRepository;

    @Autowired
    private JpaRepository jpaRepository;

    @Override
    public void run(String... args) throws Exception {
        jpaRepository.insert(new Course(1, "Learn Java", "stymsaw"));
        jpaRepository.insert(new Course(3, "Learn Mawa", "stymsaw"));
        jpaRepository.insert(new Course(4, "Learn Kawa", "stymsaw"));
        jpaRepository.insert(new Course(5, "Learn Gawa", "stymsaw"));

        jpaRepository.deleteById(1);

//        System.out.println(jpaRepository.findById(2));
        System.out.println(jpaRepository.findById(3));
        System.out.println(jpaRepository.findById(4));
    }
}
