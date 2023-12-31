# Паттерны проектирования

# Порождающие паттерны

## Фабрика (Factory)

Фабрика - это общая концепция проектирования функций, методов и классов, когда какая-то одна часть программы отвечает за создание других частей программы.

----

Простая фабрика - объект для создания других объектов.
Обычно это класс в котором есть один метод с условным оператором, выбирающим создаваемый объект.

У простой фабрики, как правило, нет подклассов.

----

Фабричный метод - порождающий шаблон проектирования, предоставляющий подклассам интерфейс для создания экземпляров некоторого класса.

Если вы видите иерархию классов продуктов и абстрактный создающий метод, который переопределяется в подклассах, то перед вами паттерн "Фабричный метод".

----

Абсстрактная фабрика - подорождающий шаблон проектирования, предоставляет интерфейс для создания семейств взаимосвязанных или взаимозависимых объектов, не специфицируя их конкретных классов.

Простыми словами - фабрика фабрик.

## Строитель (Builder)

Строитель - это паттерн проектирования, который позволяет поэтапно создавать сложные объекты с помощью четко определенной последовательности действий.

Строитель позволяет сделать инициализацию структур данных более наглядной, гибкой при этом сохраняя такое полезное их свойство как неизменяемость.

## Одиночка (Singleton)

Одиночка гарантирует, что у класса есть только один экземпляр, и продоставляет к нему глобальную точку доступа.

**Преимущества:**
 - Объект класса в единственном экземпляре
 - Глобальная видимость
 - Ленивая инициализация
 
**Недостатки:**
 - Нарушает принцип единой ответственности (SRP)
 - Маскирует плохой дизайн
 - Проблемы тестирования
 
## Прототип (Prototype)

Прототип - это порождающий паттерн, позволяющий создавать новые объекты на основе имеющегося экземпляра (прототипа).

На практике применяется для клонирования существующих объектов.

В Java требуется имплементация интерфейса Cloneable.

# Структурные паттерны

## Адаптер (Adapter)

Адаптер - преобразует интерфейс одного класса в интерфейс другого.

Используется для того, чтобы существующие классы работали с другими без изменения их исходного кода.

## Мост (Bridge)

Мост - это структурный паттерн проектирования, который разделяет один или несколько классов на две отдельные иерархии - абстракцию и реализацию, позволяя изменять их независимо друг от друга.

**Преимущества:**
 - Улучшает масштабируемость кода
 - Уменьшает связанность классов
 
## Декоратор (Decorator)

Декоратор - это структурный паттерн, который позволяет добавлять объектам новое поведение на лету, помещая их в объекты-обёртки.

Гибкая альтернатива подклассам для расширения функциональности.

Примеры декораторов в стандартных библиотеках Java:
Подклассы InputStream, OutputStream, Reader, Writer, например GZIPInputStream.

## Фасад (Facade)

Фасад - это структурный паттерн проектирования, который предоставляет простой интерфейс к сложной системе классов, библиотеке или фреймворку.

Основная задача: упрощение использования сложной системы.

**Преимущества:**
 - Изолирует клиентов от компонентов сложной подсистемы.
 
**Недостатки:**
 - Фасад может превратиться в антипаттерн божественный объект.
 
## Заместитель (Proxy)

Заместитель - это объект, который выступает прослойкой между клиентом и реальным сервисным объектом.

**Возможности:** 
 - Ленива инициализация (виртуальный прокси)
 - Защита доступа (защищающий прокси)
 - Кеширование объектов (кэширующий прокси)
 - Преобразование протоколов (удаленный прокси)
 - Логирование запросов (логирующий прокси)
 
# Поведенческие паттерны
 
## Цепочка обязанностей (Chain of responsibility)

Цепочка обязанностей - это поведенческий паттерн проектирования, который позволяет передавать запросы последовательно по цепочке обработчиков.

**Применимость:**
 - Заранее не изветно какой из обработчиков понадобится для обработки запроса
 - Требуется трогий порядок обработки запроса разными обработчиками
 - Необходимость динамически задавать набор обработчиков
 
## Шаблонный метод (Template Method)

Шаблонный метод - это поведенческий паттерн, задающий основу алгоритма и позволяющий подклассам переопределить некоторые его шаги, не изменяя его структуру в целом.

## Наблюдатель (Observer)

Наблюдатель - это поведенческий паттерн, который позволяет объектам оповещать другие объекты об изменениях своего состояния.

**Состоит из:**
 - Подписчиков (Observer)
 - Издатель (Observable)

# Антипаттерны

## Магическое число

Магическое число - неименованная константа, используемая для идентификации ресурса или данных, значение и смысл которых знает только автор программы.

**Пример:**
```java
rectangle.setSize(5, 15);
```
**Правильно:**
```java
private static final int WIDTH = 5;
private static final int HEIGHT = 15;
rectangle.setSize(WIDTH, HEIGHT);
```

## Спагетти-код

Спагетти-код - плохо спроектированная, слабо структурированная, запутанная и трудная для понимания программа.
**Причины:**
- Неопытность разработчика
- Горят сроки
**Решение:** рефакторинг, разбиение на отдельные методы

## Таинственный код

Таинственный код - использование аббревиатур вместо понятных имен.

**Неправильно:**

```java
public Person fpbi(long id) {...}
```
**Правильно:**

```java
public Person findPersonById(long id) {...}
```
**Решение:** использование понятных имен переменных, методов и классов.

## Жесткое кодирование

Жесткое кодирование - сохранение в исходном коде конфигурационных данных, вместо получения их из файла конфигурации, базы данных, пользовательского ввода или другого внешнего источника.
**Проблемы:**
- Приложение работает корректно в строго определённой среде
- Перенос приложения или внешние изменения могут потребовать внесение доработок в код.
**Решение:** использовать конфигурационные файлы для настройки приложения.

## Мягкое кодирование

Мягкое кодирование - патологическая боязнь жёсткого кодирования, приводящая к тому что настраивается всё что угодно, при этом конфигурирование системы само по себе превращается в программирование.
**Решение:** выносить в настройки только те параметры, которые действительно могут быть изменены.

## Слепая вера

Слепая вера - недостаточная проверка корректности входных данных.
**Решение:** проверять корректность входных данных.

## Божественных объект

Божественный объект - антипаттерн объектно-ориентированного программирования, описывающий объект, который хранит в себе "слишком много" или делает "слишком много"
**Решение:** распределить ответственность между различными классами программы, руководствуясь принципом единой ответственности.

## Полтергейст

Полтергейст - это антипаттерн класса, не несущего пользы, который используется для вызова методов другого класса или просто добавляет ненужный слой абстракции
**Решение:** удалить Полтергейст класса, перенеся его функциональность в вызываемый или вызывающий класс.

## Одиночество

Одиночество - неуместное использование паттерна одиночка
**Проблема:** усложняет написание модульных тестов.
**Решение:** разумное использование паттерна одиночка.

## Каша из интерфейсов

Каша из интерфейсов - объединение несольких интерфейсов, разделенных согласно принципу разделения интерфейсов, в один.
**Проблемы:**
- Теряется назначение интерфейса
- Переусложняется логика приложения
- Появляются методы-пустышки
**Решение:** не нарушать принцип разделения интерфейса (ISP)

## Заглушка

Заглушка - попытка "натянуть" на объект уже имеющийся малоподходящий по смыслу интерфейс, вместо создания нового.
**Проблема:** появление методов-пустышек.
**Решение:** разделить интерфейс или создать новый.

## Копирование-вставка

Копирование-вставка - многократное копирование существующего кода вместо создания общих решений (нарушение принципа DRY).
**Решение:** не копировать код внутри проекта, а создавать общие решения, которые можно переиспользовать.

## Золотой молоток

Золотой молото - уверенность в том, что любимое решение универсально применимо.
**Решение:** для каждой конкретной задачи подбирать наиболее подходящий инструмент, рассматривая альтернативы.

## Фактор невероятности

Фактор невероятности - предположение о невозможности того, что сработает известная ошибка.
**Решение:** всегда проверять возвращаемые результаты на наличие ошибок.

## Изобретение велосипеда

Изобретение велосипеда - создание с нуля, вместо использования готового решения.
**Решение:** перед решением задачи поискать распространённые готовые решения
