import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToUnmodifiableList {
    public static void main(String[] args) {
        List<String> unmodifableList = Stream.of("a", "b")
                .collect(Collectors.toUnmodifiableList());
        // unmodifableList.add("c"); //it will not work - toUnmodifiableList returns immutable collection
    }
}
