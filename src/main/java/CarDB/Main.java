package CarDB;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void search(Scanner scanner, int value, int start, int end) {
    System.out.println("+--------------+ \n" +
            "|   Welcome    | \n" +
            "+--------------+ \n" +
            "|  Version 1.0 | \n" +
            "+--------------+ \n" +
            "1" + " Меню поиска \n" +
            "2" + " Занести в базу данные по новой машине \n" +
            "3" + " Редактирование информации о машине по VIN коду \n" +
            "4" + " Удалить машину с базы по VIN коду \n" +
            "0" + " Назад \n" +
            "-1" + " Выход из программы");
    switch (scanner.nextInt()) {
      case 0: {
        search(scanner, (value + end) / 2, value, end);
        return;
      }
      case -1: {
        System.out.println("Good bey");
        return;
      }
      case 1: {
        System.out.println("1" + " Поиск по VIN коду машины \n" +
                "2" + " Поиск по регистрационному номеру машины \n" +
                "3" + " Поиск по марки и модели \n" +
                "4" + " Поиск по году выпуска от ...до \n" +
                "5" + " Поиск по пробегу от ... до \n" +
                "6" + " Поиск по цене от .. до \n" +
                "7" + " Отобразить список всех машин \n" +
                "0" + " Назад");
        break;

      }
      case 2: {
        System.out.println("Введите данные машины:");
        scanner.nextInt();
        search(scanner, (value + end) / 2, value, end);
        return;
      }
      case 3: {
        System.out.println("Редактирование информации о машине по VIN коду");
        scanner.nextInt();
        return;
      }
      case 4: {
        System.out.println("Удалить машину с базы по VIN коду");
        scanner.nextInt();
        search(scanner, (value + end) / 2, value, end);
        return;
      }

    }

    switch (scanner.nextInt()) {
      case 0: {
        System.out.println("Back <--");
        search(scanner, (value + end) / 2, value, end);
        break;
      }
      case 1: {
        System.out.println("Введите VIN номер машины. Для возврата в предыдущее меню введите цифру 0.");
        scanner.nextInt();
        search(scanner, (value + end) / 2, value, end);
        break;
      }
      case 2: {
        System.out.println("Введите регистрационный номер машины. Для возврата в предыдущее меню введите цифру 0.");
        scanner.nextInt();
        search(scanner, (value + end) / 2, value, end);
        break;
      }
      case 3: {
        System.out.println("Вывести весь список машин. Для возврата в предыдущее меню введите цифру 0.");
        scanner.nextInt();
        search(scanner, (value + end) / 2, value, end);
        break;
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    search(scanner, 4, 1, -1);
    ArrayList<String> cars = new ArrayList();
    cars.add("Mazda");
    cars.add("Mazda");
    cars.add("Mazda");
    cars.add("Mazda");



  }
}








