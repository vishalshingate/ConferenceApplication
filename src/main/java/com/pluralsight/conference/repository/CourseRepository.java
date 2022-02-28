package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
