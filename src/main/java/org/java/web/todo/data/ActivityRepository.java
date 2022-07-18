package org.java.web.todo.data;

import org.java.web.todo.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

    @Query("select a from Activity a where a.status = :status")
    List<Activity> findByStatus(@Param("status") String status);
}
