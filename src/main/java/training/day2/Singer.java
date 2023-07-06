package training.day2;

public class Singer extends Person{
    public boolean canPlayGuitar;
    public String bandName;
    public void sing(){
        System.out.println("lalalala");
    }
    public void playGuitar(){
        if (canPlayGuitar){
            System.out.println("Playing guitar.");
        }else{
            System.out.println("Can't play guitar");
        }
    }
    public void learn(){
        System.out.println("The singer is learning");
    }
}
