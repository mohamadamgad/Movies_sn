package com.example.amgad.movies_sn;

/**
 * Created by amgad on 05/12/15.
 */
public class comments {

    private int id;
    private int post_id;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String comment;
}
