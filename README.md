# Автоматизация тестирования UI Zoho Calendar

Тестовый фреймворк для автоматизированного тестирования UI веб-приложения Zoho Calendar

![image](https://github.com/NikitaRyzhkov/UI-Auto-Tests/assets/121218999/9e1c2c3a-ae79-48db-b245-ac5a2b505d2c)

Цель проекта - практическое применение, совершенствование и демонстрация навыков в области автоматизированного тестирования UI.
## Структура
![image](https://github.com/NikitaRyzhkov/UI-Auto-Tests/assets/121218999/f9112a09-58d1-4c68-88f6-23fa34314307)

### main
В пакете pages находятся Page objects, содержащие Selenide elements  и методы взаимодействия с ними.

В пакете elements находятся Page element objects, а именно объекты характеризующие отдельные элементы страницы, например, LeftMenuElement - левого бокового меню.

В пакете utils находятся вспомогательные классы, а именно класс, парсящий json-файл с данными пользователя, необходимыми для авторизации.

### test
В директории test находятся тесты на исполнение.

Класс BaseTest содержит метод настройки вэб-драйвера.

Класс SignIn, который наследует BaseTest, содержит метод для авторизации пользователя.

## Технологии
**Selenide** для управления браузером, выполнения ассертов.

**TestNG** для управления тестами с помощью аннотаций и файла _testng.xml_, выполнения Asserts и Soft Asserts.

**Allure** для формирования наглядных отчетов
## Документация
Selenide: https://selenide.gitbooks.io/user-guide/content/en/

Примеры использования Selenide: https://github.com/selenide/selenide/tree/main/src/test

TestNG: https://testng.org/doc/documentation-main.html
