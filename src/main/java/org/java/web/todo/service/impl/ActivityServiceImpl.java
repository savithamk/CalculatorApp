package org.java.web.todo.service.impl;

import org.java.web.todo.data.ActivityRepository;
import org.java.web.todo.model.ActivityDto;
import org.java.web.todo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository repository;

    @Override
    public void save(ActivityDto activity) {
        repository.save(activity.toEntity());
    }

    @Override
    public List<ActivityDto> findAll() {
        return repository.findAll().stream().map(ActivityDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public List<ActivityDto> findAllByStatus(String status) {
        return repository.findByStatus(status).stream().map(ActivityDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
