package ObjectFunc;

import java.util.Objects;

public class Equals {
    private int id;
    private String name;

    public Equals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // 如果 obj 为null这个if判断的结果直接是false
        if (obj == this) {
            return true;
        }

        // getClass() 获取对象运行时类
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Equals other = (Equals) obj;

        return Objects.equals(other.name, name) && other.id == id;
    }
}
