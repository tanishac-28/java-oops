/*
Hybrid Inheritance :-

Hybrid inheritance is a combination of two or more
types of inheritance.

Java does not support hybrid inheritance directly
through classes because multiple inheritance through
classes is not allowed.

However, hybrid inheritance can be achieved by combining
class inheritance and interfaces.

Advantages:
1. Code reusability
2. Flexibility in class design
3. Combines different inheritance structures
*/

package Inheritance;

class Device{
    void turnOn(){
        System.out.println("Device is turned on");
    }
}

interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone extends Device implements Camera, MusicPlayer{

    @Override 
    public void takePhoto(){
        System.out.println("Taking a Photo");
    }

    @Override 
    public void playMusic(){
        System.out.println("Playing Music");
    }
}

public class HybridInheritance {

    public static void main(String[] args) {
        
        SmartPhone phone = new SmartPhone();

        phone.turnOn();
        phone.takePhoto();
        phone.playMusic();
    }
}