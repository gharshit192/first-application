package res
import jakarta.ws.rs.*
import jakarta.ws.rs.core.MediaType
import jakarta.ws.rs.core.Response


@Path("/res")
class Resource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun welcome() : Response{
       return Response.ok("Welcome").build()
    }

}

