package main.ru.javawebinar.webapp.model;

import java.util.Collection;

/**
 * GKislin
 * 18.09.2015.
 */
public class Resume {
    private int id;
    private String fullName;

    private Collection<Contact> contacts;
    private Objective objective;
    private Collection<Qualifications> qualification;
    private Collection<Achievement> achievements;
    private Collection<Education> educations;
    private Collection<Expririence> expririences;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Collection<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<Contact> contacts) {
        this.contacts = contacts;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public Collection<Qualifications> getQualification() {
        return qualification;
    }

    public void setQualification(Collection<Qualifications> qualification) {
        this.qualification = qualification;
    }

    public Collection<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(Collection<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Collection<Education> getEducations() {
        return educations;
    }

    public void setEducations(Collection<Education> educations) {
        this.educations = educations;
    }

    public Collection<Expririence> getExpririences() {
        return expririences;
    }

    public void setExpririences(Collection<Expririence> expririences) {
        this.expririences = expririences;
    }
}
