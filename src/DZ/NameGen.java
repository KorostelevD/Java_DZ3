package DZ;
import java.util.Random; //Додаю Random

public class NameGen {
    public static void main(String[] args) {
        // Створюю масиви імен, по батькові та прізвищ
        String[] firstName = {"Максим", "Роман", "Денис", "Віктор", "Дмитро", "Андрій", "Михайло", "Юрій", "Олег", "Василь"};
        String[] middleName = {"Юрійович", "Петрович", "Олександрович", "Вікторович", "Дмитрович", "Андрійович", "Михайлович", "Іванович", "Олегович", "Васильович"};
        String[] lastName = {"Петренко", "Шевченко", "Коваль", "Бондаренко", "Ткаченко", "Романенко", "Лисенко", "Зайцев", "Гриценко", "Кравченко"};

        // Створюємо об'єкт Random для генерації випадкових чисел
        Random random = new Random();

        // Створюємо StringBuilder для збереження результату
        StringBuilder result = new StringBuilder();



        // Цикл для генерації 10 випадкових поєднань
        for (int i = 0; i < 10; i++) {
            // Генеруємо випадкові індекси для масивів, використовуючи Метод int nextInt(int max). 0 входить до діапазону, max — не входить. firstNames.length — це довжина масиву
            int firstNameIndex = random.nextInt(firstName.length);
            int middleNameIndex = random.nextInt(middleName.length);
            int lastNameIndex = random.nextInt(lastName.length);

            // Формуємо рядок з номером, прізвищем, ім'ям та по батькові, додаємо дані за допомогою append
            result.append(i + 1).append("\t") //Додаємо +1 щоб небуло 0 - го елемента
                    .append(lastName[lastNameIndex]).append("\t")
                    .append(firstName[firstNameIndex]).append("\t")
                    .append(middleName[middleNameIndex]).append("\n");
        }
        // Виводимо результат у консоль
        System.out.println(result.toString());

     }
    }
