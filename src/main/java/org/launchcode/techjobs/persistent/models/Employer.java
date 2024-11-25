package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required.")
    @Size(max = 50, message = "Cannot be longer than 50 characters" )
     private String location;

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer(String location) {
        this.location = location;
    }

    public Employer(){}

    public @NotBlank(message = "Location is required.") @Size(max = 50, message = "Cannot be longer than 50 characters") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Location is required.") @Size(max = 50, message = "Cannot be longer than 50 characters") String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
