public class Exercise4_6_Multadd {

    /**
     * Üç double değişkeni alır ve a * b + c işleminin sonucunu döndürür.
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * Bir double değişken x alır ve x * e^(-x) + (1 - e^(-x)) işleminin sonucunu döndürür.
     * Burada e^(-x) için Math.exp(-x) kullanılır.
     */
    public static double expSum(double x) {
        // İstenen formül: x * Math.exp(-x) + (1 - Math.exp(-x))
        return x * Math.exp(-x) + (1 - Math.exp(-x));
    }

    public static void main(String[] args) {
        // İstenen ifadelerin test edilmesi

        // 1. multadd(1.0, 2.0, 3.0)
        // Beklenen: 1.0 * 2.0 + 3.0 = 5.0
        System.out.println("--- multadd(a, b, c) Testi ---");
        System.out.println("multadd(1.0, 2.0, 3.0) sonucu: " + multadd(1.0, 2.0, 3.0)); // Sonuç 5.0

        // 2. sin(pi/4) + cos(pi/4) / 2
        // Bu ifadeyi hesaplamak için multadd metodunu kullanabiliriz:
        // a = 1/2, b = cos(pi/4), c = sin(pi/4) veya
        // a = 1, b = sin(pi/4), c = cos(pi/4) / 2 şeklinde doğrudan hesaplayabiliriz.
        // İstenen formüle sadık kalmak için: sin(pi/4) + 0.5 * cos(pi/4)
        double pi_over_4 = Math.PI / 4.0;
        
        double sin_val = Math.sin(pi_over_4);
        double cos_val = Math.cos(pi_over_4);
        
        // Bu ifade, sin(pi/4) + cos(pi/4) / 2 'dir. Bunu multadd ile yazmak zor olduğundan
        // doğrudan hesaplayalım ve sonucu multadd ile temsil edilebilir mi diye kontrol edelim.
        // multadd(1.0/2.0, Math.cos(pi_over_4), Math.sin(pi_over_4)) ifadesi,
        // (1/2) * cos(pi/4) + sin(pi/4) 'ü hesaplar, ki bu da istenen ifadedir.
        double result2 = multadd(0.5, cos_val, sin_val);
        System.out.println("\n--- sin(pi/4) + cos(pi/4) / 2 Testi ---");
        System.out.println("sin(pi/4) + cos(pi/4) / 2 sonucu: " + result2); 
        // Yaklaşık 0.7071 + 0.3535 = 1.0606

        // 3. log(10) + log(20)
        // Bu ifadeyi hesaplamak için de multadd metodunu kullanabiliriz:
        // a = 1, b = log(20), c = log(10) veya
        // a = 1, b = log(10), c = log(20) şeklinde.
        // Java'da Math.log() doğal logaritmayı (ln) hesaplar. 
        // İfadeyi multadd ile temsil etmek için: multadd(1.0, Math.log(20.0), Math.log(10.0))
        double result3 = multadd(1.0, Math.log(20.0), Math.log(10.0));
        System.out.println("\n--- log(10) + log(20) Testi ---");
        System.out.println("log(10) + log(20) sonucu: " + result3); 
        // ln(10) + ln(20) yaklaşık 2.302 + 2.995 = 5.297

        // expSum(x) metodu için test
        // Örneğin, x = 1.0 için test edelim.
        System.out.println("\n--- expSum(x) Testi ---");
        double x_test = 1.0;
        double result_expSum = expSum(x_test);
        System.out.println("expSum(" + x_test + ") sonucu: " + result_expSum);
    }
}
