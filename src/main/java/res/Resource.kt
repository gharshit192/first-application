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

//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    fun sayHello(request:String): Response{
//        map POJO
//        return Response.ok(name, MediaType.APPLICATION_JSON_TYPE).build()
//    }
}

