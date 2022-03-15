package model;

public class Story {
    private int id;
    private int categoryId;
    private String name;
    private double price;
    private String author;
    private String submitted;
    private String img;


    public Story() {
    }

    public Story(int categoryId, String name, double price, String author, String submitted, String img) {
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.author = author;
        this.submitted = submitted;
        this.img = img;
    }

    public Story(int id, int categoryId, String name, double price, String author, String submitted, String img) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.author = author;
        this.submitted = submitted;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
