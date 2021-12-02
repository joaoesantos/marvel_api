package org.example.marvel.api.controller;

import org.example.marvel.api.service.ReadingListsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/lists")
public class ReadingListController {

    @Inject
    ReadingListsService readingListsService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}")
    public String getLists(@PathParam("userId") long userId) {
        return readingListsService.getUserReadingList(userId);
    }
}
