package com.example.petclinic.model;

import java.util.Date;
import java.util.Objects;

public class Visit implements Modifiable {

    private Long id;
    private Date dateOfVisit;
    private String description;

    public Visit() {

    }

    public Visit(Long id) {

        this(id, null, null);
    }

    public Visit(Long id, Date dateOfVisit, String description) {

        this.id = id;
        this.dateOfVisit = dateOfVisit;
        this.description = description;

    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return Objects.equals(id, visit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Visit{");
        sb.append("id=").append(id);
        sb.append(", dateOfVisit=").append(dateOfVisit);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
