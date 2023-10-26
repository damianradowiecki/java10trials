import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CopyOf {

    public static void main(String[] args) {
        Map<Integer, String> alphabetMap = Map.copyOf(new HashMap<>(Map.of(1, "a", 2, "b")));
        // alphabetMap.put(3, "c"); //it will not work - copy of returns immutable collection
        Set<String> alphabetSet = Set.copyOf(new HashSet<>(Set.of("a", "b")));
        //alphabetSet.add("c"); //it will not work - copy of returns immutable collection
    }
}
