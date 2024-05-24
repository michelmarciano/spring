package br.com.moon.springwebapp.spring.user.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class CreateUserRequest {

    @NotNull(message = "Name is requerid")
    private String name;

    @NotBlank(message = "Favorite movie name is mandatory")
    private String favoriteMovieTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteMovieTitle() {
        return favoriteMovieTitle;
    }

    public void setFavoriteMovieTitle(String favoriteMovieTitle) {
        this.favoriteMovieTitle = favoriteMovieTitle;
    }


}
