Rekap Refactoring_1302223146_Fajar Jelang Ramadhan

-Long Method: Method calculateTax() di TaxFunction sudah dipisah ke beberapa method kecil.

-Long Parameter List: Method calculateTax() awalnya menerima 6 parameter diganti dengan memanggil objek EmployeeTaxData.
-Large Class: Class Employee memiliki terlalu banyak workload sehingga saya pecah menjadi 3 class PersonalInfo, FamilyInfo, IncomeDetail
-Primitive Obsession: Field Gender diubah dari boolean menjadi enum di PersonalInfo
-Data Clumps: Data yang sering muncul bersama (pendapatan dan keluarga) sudah dipindahkan ke class IncomeDetail dan FamilyInfo.

