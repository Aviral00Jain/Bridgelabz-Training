public class TemperatureLogger {

     /*   11. Temperature Logger 🌡️
        Record temperatures over 7 days.
        ● Use array and for-loop.
        ● Find average and max temperature.
        ● Use if for comparisons. Maintain readable naming and modular code blocks.*/

    public static void main(String[] args) {

        int days =7;

        // assigning values to array using random method
        double weekTemperature[] = new double[days];
        for(int i = 0 ; i < weekTemperature.length ; i++){
            weekTemperature[i] = (Math.random() * 100) + 1;
        }

        //calculating maximum temperature
        double sum = 0;
        double maxTemperature = weekTemperature[0];
        for(int i = 0 ; i < weekTemperature.length ; i++){
            if(weekTemperature[i] > maxTemperature){
                maxTemperature = weekTemperature[i];
            }
            sum  += weekTemperature[i];
        }

        //calculating average
        double averageTemperature = 0;
        averageTemperature = sum / days;

        // Displaying array
        System.out.println("Average temperature : "+ averageTemperature);
        System.out.println("Maximum Temperature : "+ maxTemperature);
    }
}
