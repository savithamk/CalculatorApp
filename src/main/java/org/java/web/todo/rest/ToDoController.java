package org.java.web.todo.rest;

import org.java.web.todo.model.ActivityDto;
import org.java.web.todo.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ActivityService activityService;

    @GetMapping("/all")
    public List<ActivityDto> listAll(){
        return activityService.findAll();
    }

    @GetMapping("/{status}/all")
    public List<ActivityDto> listAllByStatus(@PathVariable("status") String status){
        return activityService.findAllByStatus(status);
    }

    @PostMapping
    public List<ActivityDto> save(@RequestBody ActivityDto dto){
        activityService.save(dto);
        return activityService.findAll();
    }

    @DeleteMapping("/{id}")
    public List<ActivityDto> delete(@PathVariable("id") Long id){
        activityService.delete(id);
        return activityService.findAll();
    }

}
