//import io.undertow.Handlers;
//import io.undertow.Undertow;
//import io.undertow.server.handlers.resource.PathResourceManager;
//
//import java.io.File;
//
//public class UndertowDemo {
//    public static void main(String[] args) {
//        File file = new File("/");
//        Undertow server = Undertow.builder().addHttpListener(8080, "localhost")
//                .setHandler(Handlers.resource(new PathResourceManager(file.toPath(), 100))
//                        .setDirectoryListingEnabled(true))
//                .build();
//        server.start();
//    }
//}
