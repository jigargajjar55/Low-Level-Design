import java.util.*;

public class Context {

    private static Map<String, Integer> contextMap = new HashMap<>();

    public void put(String strVal, int intVal) {
        contextMap.put(strVal, intVal);
    }

    public int get(String strVal) {
        int resultVal = 1;

        if (contextMap.containsKey(strVal)) {
            resultVal = contextMap.get(strVal);
        }
        return resultVal;
    }

}
