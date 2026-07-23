public class TemperatureTester {
    public static void main(String[] args) {
        // 測試攝氏轉華氏
        double c = 0.0;
        double f = Temperature.celsiusToFahrenheit(c);
        System.out.println(c + "°C = " + f + "°F");  // 應輸出 32.0
        
        // 測試華氏轉攝氏
        double f2 = 98.6;
        double c2 = Temperature.fahrenheitToCelsius(f2);
        System.out.println(f2 + "°F = " + c2 + "°C");  // 應輸出 37.0
    }
}