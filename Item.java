//Assignment 5
//Kenny Ta 015020302
//Jonathan Nguyen-Pham, 016297682 
public class Item
{
    public Item(String name)
    {
        mName = name;
    }

    @Override
    public String toString()
    {
        return mName;
    }


    private String mName;
}