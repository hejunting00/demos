package com.example.springboottest.dto;

import lombok.Data;

@Data
public class GithubUser {
    private String name;
    private String id;
    private String bio;
    private String avatar_url;
}
