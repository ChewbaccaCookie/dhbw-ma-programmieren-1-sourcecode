# Lösung: Logische Ausdrücke

| Variablen  | Ausdruck                                       | Ergebnis |
|------------|------------------------------------------------|----------|
| `int a = 5;`<br>`int b = 10;`<br>`boolean flag = true;` | `a > 0 && b < 15 && flag` | `true`     |
| `int x = 7;`<br>`int y = 3;`<br>`boolean check = false;` | `x % 2 == 1 \|\| (y > 0 && !check)` | `true`    |
| `boolean condition1 = true;`<br>`boolean condition2 = false;` | `condition1 && (condition1 \|\| condition2)` | `true` |
| `double d1 = 4.5;`<br>`double d2 = 7.2;`<br>`int n = 3;` | `d1 >= d2 && n != 0 && (d1 / d2) > n` | `false` |
| `String str1 = "Hello";`<br>`String str2 = "World";` | `str1.length() != str2.length() && (str1.charAt(0) == str2.charAt(str2.length() - 1) \|\| str2.startsWith("W"))` | `true` |
| `int num1 = 12;`<br>`int num2 = 7;`<br>`boolean isEven = (num1 % 2 == 0);` | `isEven \|\| (num2 % 2 != 0)` | `true` |
| `char char1 = 'A';`<br>`char char2 = 'Z';`<br>`int ascii1 = (int) char1;`<br>`int ascii2 = (int) char2;` | `(ascii1 < ascii2) && (char2 - char1 == 25)` | `true` |
| `int m = 8;`<br>`int n = 4;`<br>`boolean isPositive = m > 0 && n > 0;` | `isPositive && (m + n) < (m * n)` | `false` |
| `boolean bool1 = true;`<br>`boolean bool2 = false;`<br>`int sum = 5 + 3;` | `(bool1 \|\| bool2) && (sum > 0)` | `true` |
| `int p = 7;`<br>`int q = 5;`<br>`boolean flag2 = false;` | `(p > q && !flag2) \|\| (q > p && flag2)` | `true` |