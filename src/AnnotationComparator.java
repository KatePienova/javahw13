import java.lang.reflect.Method;
import java.util.Comparator;

public class AnnotationComparator implements Comparator<Method> {
    @Override
    public int compare(Method o1, Method o2) {
        if (o1.getAnnotation(Test.class).priority() == o2.getAnnotation(Test.class).priority()) {
            return 0;
        } else if (o1.getAnnotation(Test.class).priority() > o2.getAnnotation(Test.class).priority()) {
            return 1;
        }
        return -1;
    }
}
