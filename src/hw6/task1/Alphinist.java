package hw6.task1;

public class Alphinist {
    // имя (не менее 3 символов)
    //адрес (не менее 5 символов)
    private String name;
    private String adress;

    public void setName(String name){
        if ( name == null || name.length() < 3){
            throw new IllegalArgumentException("Значение name от 3 символов");
        }
        this.name = name;
    }
    public void setAdress(String adress){
        if ( adress == null || adress.length() < 5){
            throw new IllegalArgumentException("Значение adress от 5 символов");
        }
        this.adress = adress;
    }
    public String getName(){
        return  name;
    }
    public String getAdress(){
        return adress;
    }

    public Alphinist(String name, String adress){
        setName(name);
        setAdress(adress);
    }
}
