package org.training.blog;

import java.util.Objects;

public class BlogTitle {

    private String title;

    public BlogTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private String buildSlug(String title){
        StringBuilder stringBuilder = new StringBuilder();
        String[] slugParts = title.split("[^a-zA-Z- ]+");
        for (String s : slugParts){
            stringBuilder.append(s.replace(" ","-").toLowerCase());
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BlogTitle blogTitle = (BlogTitle) o;
        return blogTitle.buildSlug(blogTitle.getTitle()).equals(this.buildSlug(title));
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.buildSlug(title));
    }
}
