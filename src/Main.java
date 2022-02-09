public class Main
{

    public static void main(String[] args)
    {
        int itemPrice = 80;
        double shipCost;
        double totalPrice = 0;

        if (itemPrice < 100)
        {
            shipCost = itemPrice * 0.02;
            totalPrice = itemPrice + shipCost;
            System.out.println("The shipping cost is " + shipCost);
            System.out.println("Your total price is " + totalPrice);
        }
        else
        {
            System.out.println("You get free shipping! Your total price will be " + totalPrice);
        }





    }
}
