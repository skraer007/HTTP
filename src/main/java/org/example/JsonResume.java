package org.example;

public class JsonResume {
    private String id;
    private String text;
    private String type;
    private String user;
    private Object upvotes;

    public JsonResume(
            String id,
            String text,
            String type,
            String user,
            Object upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public JsonResume() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Object getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(Object upvotes) {
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upVotes=" + upvotes +
                '}';
    }
}