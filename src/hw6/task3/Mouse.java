package hw6.task3;

public class Mouse {
    // скорость
    private  double speedMouse;

    // сеттер для speedMouse
    public  void setSpeedMouse(Double speedMouseValue){
        if (speedMouseValue == 0){
            throw IllegalArgumentException("скорость мыши больше 0");
        }
        speedMouse = speedMouseValue;
    }

    // геттер для speedMouse
    public  Double getSpeedMouse(){return speedMouse};
    }