public class VolumeOfEarth {
    public static void main(String[] args) {
        // Given radius of Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor
        double kmToMiles = 0.621371;

        // Radius in miles
        double radiusMiles = radiusKm * kmToMiles;

        // Volume formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        // Output
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm3 +
            " and cubic miles is " + volumeMiles3
        );
    }
}
