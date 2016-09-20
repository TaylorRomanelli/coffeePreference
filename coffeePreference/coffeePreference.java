public class coffeePreference
{
    
    private int numCreamer;
    private int numSugar;
    //you didn't want a function contract here lol
    public coffeePreference(int creamer, int sugar)
    {
        numCreamer=creamer;
        numSugar=sugar;
    }

    /**
     * Description: prints out the number of creamers and sugars to user uses
     * Input: no input
     * Output: number of creamers and sugars
     * Sample: "Number of Creamers: 1" "Number of Sugars: 2" 
     */
    public void showPreference()
    {
        System.out.println("Number of Creamers: " + numCreamer);
        System.out.println("Number of Sugars: " + numSugar);
    }
}
