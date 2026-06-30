interface HttpService {
    void handleHttpRequest();
}

interface DatabaseManager {
    void executeSqlStatement();
}

interface ContainerOps {
    void restartDockerContainer();
}

class WebController implements HttpService {
    @Override
    public void handleHttpRequest() {
        System.err.println("Routing traffic to endpoint.");
    }
}

class DatabaseService implements DatabaseManager {
    @Override
    public void executeSqlStatement() {
        System.err.println("Executing SQL query.");
    }
}

class DockerManager implements ContainerOps {
    @Override
    public void restartDockerContainer() {
        System.out.println("Restarting Docker container.");
    }
}

public class Main6 {
    public static void main(String[] args) {
        HttpService controller = new WebController();
        controller.handleHttpRequest();
        DatabaseManager db = new DatabaseService();
        db.executeSqlStatement();
        ContainerOps docker = new DockerManager();
        docker.restartDockerContainer();
    }
}

