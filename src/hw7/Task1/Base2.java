package hw7.Task1;

abstract public class Base2 extends Base{
    private String predmet;
    public  Base2(String predmet, String name){
        super(name);
        if (predmet == null) {
            throw new IllegalArgumentException("пред должно содержать символы");
        }
        this.predmet = predmet;
    }

    public String getPredmet(){return predmet;}
}
