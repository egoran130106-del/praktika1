# Практика 1 — решения на Java

Решения всех программных заданий из четырех PDF «ПР1 часть 1–4».
В четвертом файле выполнены также задания раздела 4.1 и упражнение 1.

## Папки

- [Часть 1](part1) — массивы, циклы, аргументы, гармонический ряд, факториал.
- [Часть 2](part2) — Author и TestAuthor по UML.
- [Часть 3](part3) — фигуры, абстрактные классы и интерфейс Movable.
- [Часть 4](part4) — перечисления, наследование, магазин, ателье и остальные задания.

## Как запустить

Нужен **JDK 8 или новее**, а не только JRE. Откройте нужную папку в IntelliJ IDEA,
выберите JDK и запустите метод main в классе с именем файла.
Либо откройте терминал внутри папки части:

```text
javac -encoding UTF-8 *.java
java Task03
```

Замените Task03 именем нужного файла без .java. Каждая программа запускается отдельно.
В части 2 компилируются оба файла — Author.java и TestAuthor.java, запускается TestAuthor.
В остальных заданиях вспомогательные классы собраны внутри файла задания как static-классы,
чтобы одинаковые имена Shape и Circle не конфликтовали. В каждой папке README с пояснениями.
Для кириллицы используйте UTF-8, при проблемах в терминале запускайте из IntelliJ IDEA.

## Какой код к какому заданию

| Задание | Файл для запуска |
| --- | --- |
| Часть 1, задание 3: сумма и среднее массива | [Task03.java](part1/Task03.java) |
| Часть 1, задание 4: ввод, сумма, минимум и максимум | [Task04.java](part1/Task04.java) |
| Часть 1, задание 5: аргументы командной строки | [Task05.java](part1/Task05.java) |
| Часть 1, задание 6: первые 10 членов гармонического ряда | [Task06.java](part1/Task06.java) |
| Часть 1, задание 7: факториал | [Task07.java](part1/Task07.java) |
| Часть 2: класс Author по UML | [TestAuthor.java](part2/TestAuthor.java) |
| Часть 3, задание 1: абстрактные фигуры | [Task01Shapes.java](part3/Task01Shapes.java) |
| Часть 3, задание 2 и подпункт 2: движущиеся фигуры | [Task02Movable.java](part3/Task02Movable.java) |
| Часть 4, раздел 4, задание 1: времена года | [Section4Task01Seasons.java](part4/Section4Task01Seasons.java) |
| Часть 4, раздел 4, задание 2: ателье | [Section4Task02Atelier.java](part4/Section4Task02Atelier.java) |
| Часть 4, раздел 4, задание 3: учебный интернет-магазин | [Section4Task03Shop.java](part4/Section4Task03Shop.java) |
| Часть 4, раздел 4, задание 4: компьютер | [Section4Task04Computer.java](part4/Section4Task04Computer.java) |
| Часть 4, раздел 4.1, задание 1: обычный класс Shape | [Section41Task01Shapes.java](part4/Section41Task01Shapes.java) |
| Часть 4, раздел 4.1, задание 2: телефон | [Section41Task02Phone.java](part4/Section41Task02Phone.java) |
| Часть 4, раздел 4.1, задание 3: человек | [Section41Task03Person.java](part4/Section41Task03Person.java) |
| Часть 4, раздел 4.1, задание 4: матрица | [Section41Task04Matrix.java](part4/Section41Task04Matrix.java) |
| Часть 4, раздел 4.1, задание 5: читатели библиотеки | [Section41Task05Library.java](part4/Section41Task05Library.java) |
| Часть 4, раздел 4.1, задание 6: работник и менеджер | [Section41Task06Employer.java](part4/Section41Task06Employer.java) |
| Часть 4, раздел 4.1, задание 7: школьники и студенты | [Section41Task07Learners.java](part4/Section41Task07Learners.java) |
| Часть 4, раздел 4.1, задание 8 и упражнение 1: абстрактные фигуры | [Section41Task08Shapes.java](part4/Section41Task08Shapes.java) |
| Часть 4, раздел 4.1, задание 9: магазин мебели | [Section41Task09Furniture.java](part4/Section41Task09Furniture.java) |
| Часть 4, раздел 4.1, задание 10: транспорт | [Section41Task10Transport.java](part4/Section41Task10Transport.java) |

## Примечания

- Код использует базовые конструкции Java и стандартную библиотеку, без внешних зависимостей.
- Данные людей вымышленные, температуры, цены и характеристики учебные.
- Магазин работает только в консоли, логин `student`, пароль `1234`, платежей нет.
- Неполная формулировка расчета зарплаты объяснена в README части 4.
- Причины ошибок из примеров с фигурами объяснены в README частей 3 и 4.
- Организационные пункты про IDE и показ преподавателю объяснены в README части 1.
- Исходные PDF не опубликованы; представлены только решения и пояснения.
