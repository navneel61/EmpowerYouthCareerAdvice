package com.example.empoweryouthcareeradvice;

class CareerAdviceCategoryModel {
    private int image;
    private String description;
    private String title;
    private String slug;
    private String link;
    private String category;
    private String cat;

    public String getSlug() { return slug; }

    public void setSlug(String slug) { this.slug = slug; }

    public String getLink() { return link; }

    public void setLink(String link) { this.link = link; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getCat() { return cat; }

    public void setCat(String cat) { this.cat = cat; }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
