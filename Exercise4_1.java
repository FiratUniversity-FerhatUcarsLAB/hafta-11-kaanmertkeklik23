public class DatePrinting {

    // Amerikan Formatı: Day, Month Date, Year (Örn: Thursday, July 16, 2015)
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("Amerikan Formatı: " + day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa Formatı: Day Date Month Year (Örn: Thursday 16 July 2015)
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("Avrupa Formatı:   " + day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        // Test verilerini tanımlayalım
        String day = "Perşembe";    // Day
        int date = 4;               // Date
        String month = "Aralık";    // Month
        int year = 2025;            // Year

        System.out.println("--- Tarih Yazdırma Testi ---\n");

        // Metotları çağıralım
        printAmerican(day, date, month, year);
        printEuropean(day, date, month, year);
    }
}
