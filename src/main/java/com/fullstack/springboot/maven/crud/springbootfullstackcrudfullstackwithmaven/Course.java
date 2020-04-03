
package com.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Course {

        private Long id;
        private String username;
        private String description;

    public Course(long id, String username, String description) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        //test
    }
    //no arg constructor
        //constructor with 3 args
        //getters and setters
        //hashcode and equals

    public Long getId() {
        return id;
    }
}
