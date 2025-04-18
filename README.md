Rekap Refactoring_1302223146_Fajar Jelang Ramadhan_SE-46-04

-Long Method: Method calculateTax() di TaxFunction sudah dipisah ke beberapa method kecil.

-Long Parameter List: Method calculateTax() awalnya menerima 6 parameter diganti dengan memanggil objek EmployeeTaxData.

-Large Class: Class Employee memiliki terlalu banyak workload sehingga saya pecah menjadi 3 class PersonalCredentials, FamilyCredentials, IncomeCredentials

-Primitive Obsession: Field Gender diubah dari boolean menjadi enum di PersonalCredentials

-Data Clumps: Data yang sering muncul bersama (pendapatan dan keluarga) sudah dipindahkan ke class IncomeCredentials dan FamilyCredentials.

-Comment: Menghapus comment-comment code panjang yang tidak penting

Referensi: Slide Pertemuan 3 - Refactoring, https://refactoring.guru

