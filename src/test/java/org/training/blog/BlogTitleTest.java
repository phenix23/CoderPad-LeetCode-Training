package org.training.blog;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BlogTitleTest {


    @Test
    public void shouldReturnFalse(){
        BlogTitle t1 = new BlogTitle("Here is an article");
        BlogTitle t2 = new BlogTitle("another title");
        assertNotEquals(t1, t2);
    }

    @Test
    public void shouldReturnTrue(){
        BlogTitle t1 = new BlogTitle("Here is an article");
        BlogTitle t2 = new BlogTitle("HERE-IS-AN-ARTICLE");
        assertEquals(t1, t2);
    }

    @Test
    public void shouldReturnSameHashCode(){
        BlogTitle t1 = new BlogTitle("Here is an article");
        BlogTitle t2 = new BlogTitle("another title");
        HashMap<BlogTitle, Integer> titles = new HashMap<>();
        titles.put(t1,10);
        titles.put(t2,20);
        assertEquals(10 , titles.get(new BlogTitle("here is... an article!")));
        assertEquals(20 , titles.get(t2));
    }

}