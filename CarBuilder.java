//Assignment 4
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public abstract class CarBuilder 
{
    public abstract void addEngine();
    public abstract void addBody();
    public abstract void addSoundSystem();
    public abstract void addWheels();

    public final Car build()
    {
        return new Car();
    }

}
