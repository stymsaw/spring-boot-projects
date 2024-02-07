package stym.springboot.jpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import stym.springboot.jpaandhibernate.course.Course;

@Repository
public class JdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSET_QUERY = """
                                insert into course (id,name,author) values (?,?,?);
            """;
    private static String DELETE_QUERY = """
                                delete from course where id  = ?
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSET_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteCourseById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }
}
