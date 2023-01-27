public class Arrays {
    public static void main(String[] args) {

        String[] androidVersions = new String[17];

        String days[] =new String[7];

        String[][] cities = new String[4][2];

        int [][][] numbers = new int[2][2][2];
        int [][][][] numers4 = new int[2][2][2][2];

        androidVersions[0]= "Apple Pie";
        androidVersions[1]= "Banana Bread";
        androidVersions[2]= "Cupcake";
        androidVersions[3]= "Donut";

        for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }

        for (String androidVersion:androidVersions) {
            System.out.println(androidVersion);
        }

        System.out.println();
        System.out.println();

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        System.out.println();
        System.out.println();
        for (String[] pair :cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }
    }
}
