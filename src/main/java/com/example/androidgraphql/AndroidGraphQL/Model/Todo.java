package com.example.androidgraphql.AndroidGraphQL.Model;

import javax.persistence.*;

@Entity
@Table
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String title;

    private String Description;

    private Long duration;

    public Todo(){

    }
    public Todo(String title, String description, Long duration) {
        this.title = title;
        Description = description;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
