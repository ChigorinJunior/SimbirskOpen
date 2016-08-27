package ru.chigorinjunior.simbirskopen.providers;

import java.util.ArrayList;
import java.util.List;

import ru.chigorinjunior.simbirskopen.domain.Day;
import ru.chigorinjunior.simbirskopen.domain.Item;
import ru.chigorinjunior.simbirskopen.domain.Schedule;

public class ScheduleProvider {
    public static Schedule getSchedule() {
        List<Day> days = new ArrayList<>(2);

        List<Item> items1 = new ArrayList<>();
        List<Item> items2 = new ArrayList<>();

        items1.add(new Item(Item.ItemType.CHGK, "15.00", "16.40", "Турнир по «Что? Где? Когда?». Туры 1, 2 (редактор: Павел Солахян"));
        items1.add(new Item(Item.ItemType.CHGK, "16.50", "17.35", "Турнир по «Что? Где? Когда?». Тур 3 (редактор: Евгений Калюков"));
        items1.add(new Item(Item.ItemType.ORGANIZATION, "17.35", "17.45", "Прием апелляций на 1-3 туры «Что? Где? Когда?»"));
        items1.add(new Item(Item.ItemType.POLYATLON, "17.45", "19.00", "Интеллектуальное многоборье."));
        items1.add(new Item(Item.ItemType.BREAK, "19.00", "20.00", "Перерыв на ужин."));
        items1.add(new Item(Item.ItemType.BRAIN, "20.00", "21.00", "Чемпионат Поволжья по «Брейн-рингу». Полуфинальные группы - 4 площадки."));
        items1.add(new Item(Item.ItemType.QUARTET, "20.00", "21.00", "Письменный отбор на «Эрудит-квартет» (8 лучших команд Чемпионата Поволжья по «Брейн-рингу» проходят автоматически)."));
        items1.add(new Item(Item.ItemType.QUARTET, "21.00", "22.00", "«Эрудит-квартет». Полуфинальные бои - 4 площадки."));


        items2.add(new Item(Item.ItemType.QUARTET, "10.00", "10.45", "«Эрудит-квартет». Финал."));
        items2.add(new Item(Item.ItemType.BRAIN, "10.45", "11.10", "Чемпионат Поволжья по «Брейн-рингу». Бой за 3-е место."));
        items2.add(new Item(Item.ItemType.BRAIN, "11.15", "12.15", "Чемпионат Поволжья по «Брейн-рингу». Бои за 1-е место."));
        items2.add(new Item(Item.ItemType.ORGANIZATION, "12.15", "12.20", "Оглашение вердиктов по апелляциям на 1-3 туры «Что? Где? Когда?»."));
        items2.add(new Item(Item.ItemType.CHGK, "12.20", "14.10", "Турнир по «Что? Где? Когда?». Туры 4, 5 (редакторы: Евгений Калюков, Алексей и Мария Трефиловы)"));
        items2.add(new Item(Item.ItemType.ORGANIZATION, "14.10", "14.20", "Прием апелляций на 4-5 туры «Что? Где? Когда?»."));
        items2.add(new Item(Item.ItemType.ORGANIZATION, "14.20", "14.30", "Рассмотрение апелляций на 4-5 туры «Что? Где? Когда?»."));
        items2.add(new Item(Item.ItemType.ORGANIZATION, "14.30", "15.00", "Подведение итогов. Награждение победителей."));

        Day day1 = new Day("Суббота", items1);
        Day day2 = new Day("Воскресенье", items2);

        days.add(day1);
        days.add(day2);

        return new Schedule(days);
    }
}
