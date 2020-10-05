package com.valtica.api;

import com.valtica.api.beans.Track;
import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/tracks")
public interface TracksResource {
  /**
   * Gets a list of all `Track` entities.
   */
  @GET
  @Produces("application/json")
  List<Track> gettracks();

  /**
   * Creates a new instance of a `Track`.
   */
  @POST
  @Consumes("application/json")
  void createTrack(Track data);

  /**
   * Gets the details of a single instance of a `Track`.
   */
  @Path("/{trackId}")
  @GET
  @Produces("application/json")
  Track getTrack(@PathParam("trackId") String trackId);

  /**
   * Updates an existing `Track`.
   */
  @Path("/{trackId}")
  @PUT
  @Consumes("application/json")
  void updateTrack(@PathParam("trackId") String trackId, Track data);

  /**
   * Deletes an existing `Track`.
   */
  @Path("/{trackId}")
  @DELETE
  void deleteTrack(@PathParam("trackId") String trackId);
}
