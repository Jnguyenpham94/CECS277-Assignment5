

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
