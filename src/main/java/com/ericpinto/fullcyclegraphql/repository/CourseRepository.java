package com.ericpinto.fullcyclegraphql.repository;

import com.ericpinto.fullcyclegraphql.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
}
