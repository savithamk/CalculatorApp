package org.java.web.todo.service;

import org.java.web.todo.model.ActivityDto;

import java.util.List;

public interface ActivityService {
    void save(ActivityDto activity);
    List<ActivityDto> findAll();
    List<ActivityDto> findAllByStatus(String status);
    void delete(Long id);
}
