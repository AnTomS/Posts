# Posts
# Домашнее задание к занятию «2.2. ООП: Объекты и классы»

В качестве результата пришлите ссылки на ваши GitHub-проекты в личном кабинете студента на сайте [netology.ru](https://netology.ru).

**Важно**: ознакомьтесь со ссылками на главной странице [репозитория с домашними заданиями](../README.md).

Если у вас что-то не получилось, то оформляйте Issue [по установленным правилам](../report-requirements.md).

Нужно сделать все задачи в **одном** репозитории.
## Задача №1 - Посты

Наконец мы добрались до ООП и можем уже не только решать вычислительные задачи, но и моделировать целые системы.

На лекции мы разобрали упрощённый пример того, как может выглядеть пост, давайте же посмотрим на то, как он выглядит на самом деле. Возьмите себе за правило анализировать системы, с которыми вы работаете в реальной жизни, и продумывать, как бы сделали вы.

В качестве примера возьмём всё тот же VKontakte: https://vk.com/dev/objects/post Если страница недоступна, воспользуйтесь [копией](assets/post.pdf) из каталога [assets](assets)).

На что нужно обратить внимание:
1. В Kotlin мы используем `camelCase` для полей.
1. Некоторые поля помечены как `integer [0, 1]`, хотя по логике, должны быть `Boolean` (у вас должны быть `Boolean`).
1. Игнорируйте поля `post_source`, `attachments`, `geo`, `copy_history`.
1. Все остальные поля должны быть перечислены.

Что мы хотим получить:
1. Data класс `Post`.
1. Объект `WallService`, который внутри себя хранит посты в массиве.

## Задача №2 - Wall

Теперь нужно разобраться с функциональностью сервиса, отвечающего за стены пользователей: https://vk.com/dev/wall ([копия](assets/wall.pdf)).

Нас будут интересовать следующие методы:
1. Создание записи.
1. Обновление записи.
2. ## Задача №3 - Wall Tests

Куда же без автотестов? Правильно, никуда. Нужно написать автотесты на ваши методы:
* на `add` - всего один, который проверяет, что после добавления поста `id` стал не равным 0.
* на `update` - целых два:
    - изменяем пост с существующим `id`, возвращается `true`;
    - изменяем пост с несуществующим `id`, возвращается `false`.

Почему мы не проверяем, что `add` действительно добавил, а `update` действительно что-то меняет?

Нам пока совсем немного не хватает знаний, чтобы достроить нашу систему до действительно тестируемой — их мы получим на следующей лекции. Пока же сделаем так.

По факту речь идёт о том, что нам придётся либо дописать специальные вспомогательные методы, либо научиться работать с `nullable` значениями.