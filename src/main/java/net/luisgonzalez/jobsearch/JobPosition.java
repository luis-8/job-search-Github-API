package net.luisgonzalez.jobsearch;


import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class JobPosition {
    private String id;
    private String type;
    private String url;

    @SerializedName("created_at")    //serializacion si el nombre está diferente que en la api
    private String createdAt;
    private String company;

    @SerializedName("company_url")
    private String companyURL;
    private String location;
    private String title;
    private String description;

    @SerializedName("how_to_apply")
    private String howToApply;

    @SerializedName("company_logo")
    private String companyLogo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(url, that.url) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(company, that.company) &&
                Objects.equals(companyURL, that.companyURL) &&
                Objects.equals(location, that.location) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(howToApply, that.howToApply) &&
                Objects.equals(companyLogo, that.companyLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, createdAt, company, companyURL, location, title, description, howToApply, companyLogo);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", created='" + createdAt + '\'' +
                ", company='" + company + '\'' +
                ", companyURL='" + companyURL + '\'' +
                ", location='" + location + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", howToApply='" + howToApply + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return createdAt;
    }

    public void setCreated(String created) {
        this.createdAt = created;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getHowToApply() {
        return howToApply;
    }

    public void setHowToApply(String howToApply) {
        this.howToApply = howToApply;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }
}
