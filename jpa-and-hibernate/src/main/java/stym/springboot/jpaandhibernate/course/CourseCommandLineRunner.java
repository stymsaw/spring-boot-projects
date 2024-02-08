package stym.springboot.jpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import stym.springboot.jpaandhibernate.course.Course;
import stym.springboot.jpaandhibernate.course.jdbc.JdbcRepository;
import stym.springboot.jpaandhibernate.course.jpa.JpaRepository;
import stym.springboot.jpaandhibernate.course.spring_data_jpa.SpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private JdbcRepository jdbcRepository;

    @Autowired
    private JpaRepository jpaRepository;

    @Autowired
    private SpringDataJpaRepository springDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        springDataJpaRepository.save(new Course(1, "Learn Java", "stymsaw"));
        springDataJpaRepository.save(new Course(3, "Learn Mawa", "stymsaw"));
        springDataJpaRepository.save(new Course(4, "Learn Kawa", "stymsaw"));
        springDataJpaRepository.save(new Course(5, "Learn Gawa", "stymsaw"));

        springDataJpaRepository.deleteById(1L);

//        System.out.println(springDataJpaRepository.findById(2));
        System.out.println(springDataJpaRepository.findById(3L));
        System.out.println(springDataJpaRepository.findById(4L));
        System.out.println(springDataJpaRepository.findByAuthor("stymsaw"));
        System.out.println(springDataJpaRepository.findByAuthor("stym"));

    }
}
