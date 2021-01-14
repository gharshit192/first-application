import jakarta.ws.rs.core.UriBuilder
import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig
import res.Resource
import java.net.URI

fun main() {

        var baseUri: URI = UriBuilder.fromUri("http://localhost/").port(8080).build()
        var config: ResourceConfig = ResourceConfig(Resource::class.java)
        var server: HttpServer = GrizzlyHttpServerFactory.createHttpServer(baseUri, config)

}

