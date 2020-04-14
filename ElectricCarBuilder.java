//Assignment 5
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class ElectricCarBuilder extends CarBuilder{

    @Override
    public void addEngine() 
    {
        addItem(new Item("Engine: 8 Batteries"));
    }

    @Override
    public void addBody() 
    {
        addItem(new Item(""));
    }

    @Override
    public void addSoundSystem() 
    {
        addItem(new Item(""));
    }

    @Override
    public void addWheels() 
    {
        addItem(new Item(""));
    }

}
