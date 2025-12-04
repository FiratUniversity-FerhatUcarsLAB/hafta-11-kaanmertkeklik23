// 1) Donus degerini kullanmayin -> ne oluyor?
getNumber();// 1) Donus degerini kullanmayin -> ne oluyor?.

// 2) void metodu ifade icinde kullanin -> ne oluyor?
System.out.println(sayHello() + 7);

// 2) void metodu ifade icinde kullanin -> ne oluyor?
// System.out.println(sayHello() + 7); // Derleme hatası oluşur.
// Hata mesajı genellikle: "void type not allowed here" (void tipi burada kullanılamaz).
// sayHello() metodu geriye hiçbir değer (void) döndürmez.
// Bu nedenle, metot çağrısı bir ifade (sayHello() + 7) içinde bir değer temsil edemez.

Final kod örneği:
public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber(); // Metot çağrılır, "42" değeri döndürülür ancak hiçbir değişkene atanmadığı için bu değer anında yok sayılır. Derleme hatası oluşmaz.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7); // Derleme hatası oluşur. sayHello() bir değer döndürmediği için toplama işleminde kullanılamaz.

    }
}
