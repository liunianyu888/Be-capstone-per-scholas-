package org.perschlar.edu.model;

public class Chef {

    private String chefName;

    private String skill;

    private String language;

    public String getChefName() {
        return chefName;
    }

    public Chef setChefName(String chefName) {
        this.chefName = chefName;
        return this;
    }

    public String getSkill() {
        return skill;
    }

    public Chef setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Chef setLanguage(String language) {
        this.language = language;
        return this;
    }
}
