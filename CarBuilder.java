//Assignment 5
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
import java.util.ArrayList;
import java.util.List;
public abstract class CarBuilder 
{
    public abstract void addEngine();
    public abstract void addBody();
    public abstract void addSoundSystem();
    public abstract void addWheels();

    public final Car build()
    {
        return new Car(theItems);
    }

    public void addItem(Item item)
    {
        theItems.add(item);
    }

    private List<Item> theItems = new ArrayList<Item>();

}
