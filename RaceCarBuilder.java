//Assignment 5
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class RaceCarBuilder extends CarBuilder{

    @Override
    public void addEngine() 
    {
        addItem(new Item("Engine: 12 Cylinder, 400 Horsepower"));
    }

    @Override
    public void addBody() 
    {
        addItem(new Item("Body: Formula One Body"));
    }

    @Override
    public void addSoundSystem() 
    {
        addItem(new Item("Sounds: Radio in helmet"));
    }

    @Override
    public void addWheels() 
    {
        addItem(new Item("Wheels: High Performance Firestone"));
    }

}
