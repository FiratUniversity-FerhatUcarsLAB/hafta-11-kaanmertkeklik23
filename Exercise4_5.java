Adım,Metot,İşlem,Çıktı (Kümülatif)
1,main,"print(""No, I "")","No, I "
2,main,zoop() çağrılır,
3,zoop,baffle() çağrılır (1),
4,baffle,"print(""wug"")","No, I wug"
5,baffle,ping() çağrılır (1),
6,ping,"println(""."")","No, I wug. (Yeni satır)"
7,zoop,"print(""You wugga "")","No, I wug.\nYou wugga "
8,zoop,baffle() çağrılır (2),
9,baffle,"print(""wug"")","No, I wug.\nYou wugga wug"
10,baffle,ping() çağrılır (2),
11,ping,"println(""."")","No, I wug.\nYou wugga wug. (Yeni satır)"
12,main,"print(""I "")","No, I wug.\nYou wugga wug.\nI "
13,main,baffle() çağrılır (3),
14,baffle,"print(""wug"")","No, I wug.\nYou wugga wug.\nI wug"
15,baffle,ping() çağrılır (3),
16,ping,"println(""."")","No, I wug.\nYou wugga wug.\nI wug. (Yeni satır)"

    Kodun çıktısı:
No, I wug.
You wugga wug.
I wug.
