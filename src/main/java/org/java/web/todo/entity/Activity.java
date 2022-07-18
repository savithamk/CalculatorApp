package org.java.web.todo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String status;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (! (o instanceof Activity)) return false;
        Activity that = (Activity) o;
        return Objects.equals(id,that.id) &&
                Objects.equals(name,that.name) &&
                Objects.equals(status,that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }
}
