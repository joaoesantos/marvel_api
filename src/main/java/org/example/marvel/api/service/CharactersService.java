package org.example.marvel.api.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CharactersService {
    public String getCharacters() {
        return "this is a character";
    }
}
