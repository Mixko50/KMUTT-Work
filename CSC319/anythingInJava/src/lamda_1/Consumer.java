package lamda_1;

import java.util.List;

public interface Consumer<T> {
    void accept(T t);
}