import java.util.Optional;

public class OptionalOrElseThrow {

    public static void main(String[] args) {
        Optional.ofNullable(null)
                .orElseThrow();
    }
}
