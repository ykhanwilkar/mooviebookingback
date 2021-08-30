package com.vertafore.moviebookingapp.model;

import javax.persistence.*;

@Entity
@Table(name = "Languages")
public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "language_id")
    private Integer languageId;

    @Column(name = "language")
    private String language;

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
