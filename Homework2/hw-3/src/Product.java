public class Product
{
    String Name;
    float Price;
    int Rating;

    public Product(String Name, float Price, int Rating)
    {
        this.Name=Name;
        this.Price=Price;
        this.Rating=Rating;
    }

    public String GetName() {
        return Name;
    }

    public float GetPrice() {
        return Price;
    }

    public int GetRating() {
        return Rating;
    }
}
