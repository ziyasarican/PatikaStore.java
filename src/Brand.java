import java.util.Arrays;

public class Brand {
    private int id;
    private String name;
    private static String[] brands = new String[9];

    public Brand(String name) {
        this.id = id;
        this.name = name;
    }

    public static void printBrand(){
        Arrays.sort(brands);
        System.out.println("----------------------------");
        System.out.println("BRANDS:");
        for (String brand : brands) {
            System.out.println(brand);
        }
    }

    public static void addBrand(String brand, int i) {
        brands[i] = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
