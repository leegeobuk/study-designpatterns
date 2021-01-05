package singleton;

/*
    Solution 1 for multi-threading problem
    Advantage: Easy to implement
    Cost: Performance could drop around 100 times

    public static synchronized ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
*/

/*
    Solution 2 for multi-threading problem
    Advantage: Easy to implement
               No thread can access to chocolateBoiler before it's initialized
    Cost: If the cost of creating the instance is expensive, it could be costly

    private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
    public static ChocolateBoiler getInstance() {
        return chocolateBoiler;
    }
 */

/*
    Solution 3 for multi-threading problem - DCL (Double-Checking Locking)
    Advantage: Synchronize in the beginning only
               Overhead could be dramatically reduced

    private volatile static ChocolateBoiler chocolateBoiler;
    public static synchronized ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }
 */

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with milk/chocolate compound
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // pass boiled chocolate to next stage
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // boil chocolate
            boiled = true;
        }
    }
}
