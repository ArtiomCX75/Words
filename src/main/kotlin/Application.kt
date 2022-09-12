import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8081, host = "127.0.0.1") {
        configureRouting()
    }.start(wait = true)
}


fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respond(status = HttpStatusCode.OK, message = "{}")
        }


    }
    routing {
    }
}
