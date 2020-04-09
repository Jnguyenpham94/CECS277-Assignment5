//Assignment 5
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class VanBuilder extends CarBuilder{

    @Override
    public void addEngine() 
    {
        addItem(new Item("Engine: 6 Cylinder 200 Horsepower"));
    }

    @Override
    public void addBody() 
    {
        addItem(new Item("Body: Multiple Side and Back Doors"));
    }

    @Override
    public void addSoundSystem() 
    {
        addItem(new Item("Sound: DVD Player For Kids in back"));
    }

    @Override
    public void addWheels() 
    {
        addItem(new Item("Wheels: Super Safe High Friction"));
    }

}
