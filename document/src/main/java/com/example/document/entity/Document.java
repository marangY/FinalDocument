package com.example.document.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Document implements Serializable {

    @Id
    @Column(name = "documentId")
    private String documentId;

    @Column(name = "title")
    private String title;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "userName")
    private String userName;

    @Column(name = "dateDocument")
    private String dateDocument;
}
