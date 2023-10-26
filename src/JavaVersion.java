import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class JavaVersion {

    public static void main(String[] args) throws InterruptedException, IOException {
        List<String> command = new LinkedList<>();
        command.add("java");
        command.add("-version");

        ProcessBuilder builder = new ProcessBuilder(command);

        Process process = builder.inheritIO().start();
        process.waitFor();
    }
}
