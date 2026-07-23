public class Temperature {
    /**
     * 攝氏轉華氏
     * @param celsius 攝氏溫度
     * @return 華氏溫度
     */
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }
    
    /**
     * 華氏轉攝氏
     * @param fahrenheit 華氏溫度
     * @return 攝氏溫度
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}