package com.ps.conferencedemo.models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "speakers", schema = "public", catalog = "conference_app")
public class Speaker {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "speaker_id", nullable = false)
    private int speaker_id;

    private String first_name;

    private String last_name;

    private String title;

    private String company;

    private String speaker_bio;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] speaker_photo;

    @ManyToMany(mappedBy = "speakers")
    private List<Session> sessions;

    public int getSpeaker_id() {
        return speaker_id;
    }

    public void setSpeaker_id(int speakerId) {
        this.speaker_id = speakerId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String firstName) {
        this.first_name = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSpeaker_bio() {
        return speaker_bio;
    }

    public void setSpeaker_bio(String speakerBio) {
        this.speaker_bio = speakerBio;
    }

}
