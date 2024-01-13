package projeto.java.completo.vetores;

public class Heights {

    private String name;
    private int age;
    private double heights;

    public Heights(String name, int age, double heights) {
        this.name = name;
        this.age = age;
        this.heights = heights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeights() {
        return heights;
    }

    public void setHeights(double heights) {
        this.heights = heights;
    }
}
