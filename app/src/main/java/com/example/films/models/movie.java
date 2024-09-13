package com.example.films.models;

enum Genre {
    COMEDY,
    CARTOON,
    HORROR,
    FANTASY,
    THRILLER,
    ACTION,
    DRAMA,
    ADVENTURES
}
public class movie {
    private int id, status;
    private String title;
    private Genre genre;
    private String poster = "No image";
    private String description = "No description. You can add it";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
