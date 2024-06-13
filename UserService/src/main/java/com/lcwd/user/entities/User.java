package com.lcwd.user.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document("userdata")
public class User {
    @Id
    private String userId;
    private String email;
    private String name;
    private String about;
    @Transient
    private List<Rating> ratings = new ArrayList<>();



}
