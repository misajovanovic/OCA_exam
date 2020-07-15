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

    public void someDummyMethod(){
        System.out.println("I am dummy idiot");
    }

    public String getName() {
        return name;
    }
}
