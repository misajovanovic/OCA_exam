package biz.misajovanovic;

public class Chick {

    private String name = "Marijana Jovanovic";

    {
        System.out.println("Setting field!!!");
    }

    public Chick() {
        this.name = "Ilijja Jovanovic";
        System.out.println("Setting a constructor");
    }

    public String getName() {
        return name;
    }
}
