/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.springbootrestblog.dto;

import com.py.springbootrestblog.model.Publication;

/**
 *
 * @author Favio Amarilla
 */
public class PublicationDTO {

    private Long id;
    private String title;
    private String description;
    private String content;

    public PublicationDTO() {
    }

    public PublicationDTO(Publication entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.description = entity.getDescription();
        this.content = entity.getContent();
    }

    public Publication build() {
        Publication entity = new Publication();
        entity.setId(this.id);
        entity.setTitle(this.title);
        entity.setDescription(this.description);
        entity.setContent(this.content);

        return entity;
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
