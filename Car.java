//Assignment 5
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
import java.util.List;
public class Car 
{
    public Car(List<Item> items)
    {
        mItems = items;
    }

    public String toString()
    {
        String car = "Consists of: \n";
        boolean firstTime = true;
        for(Item i : mItems)
        {
            if(!firstTime)
            {
                car += "\n";
            }
            car += i;
            firstTime = false;
        }

        return car;
    }

    private List<Item> mItems;

}
