package org.example.marvel.api.controller;

import org.example.marvel.api.service.CharactersService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/characters")
public class CharactersController {

    @Inject
    CharactersService charactersService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getCharacters() {
        return charactersService.getCharacters();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String favouriteCharacter() {
        return "";
    }
}