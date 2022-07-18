package org.java.web.todo.model;

import org.java.web.todo.entity.Activity;

public class ActivityDto {

    private Long id;
    private String name;
    private String status;

    public static ActivityDto fromEntity(Activity activity){
        ActivityDto dto = new ActivityDto();
        dto.setId(activity.getId());
        dto.setName(activity.getName());
        dto.setStatus(activity.getStatus());
        return dto;
    }

    public Activity toEntity(){
        Activity activity = new Activity();
        activity.setId(id);
        activity.setName(name);
        activity.setStatus(status);
        return activity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
