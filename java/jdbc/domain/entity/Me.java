package domain.entity;

public class Me {
    private int id;
    private String name;

    public Me() {
    }

    @Override
    public String toString() {
        return "Me{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Me(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
