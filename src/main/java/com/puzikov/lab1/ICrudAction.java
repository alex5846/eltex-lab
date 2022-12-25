package com.puzikov.lab1;

public interface ICrudAction {
    //todo никаких startCreate, startRead и тд. в задании четко написано:
    // Создать интерфейс ICrudAction, задающий действия над объектом (create, read, update, delete):
    // create – заполнение объекта случайными значениями и инкремент счётчика.
    // read – вывод данных на экран.
    // update – ввод данных с клавиатуры.
    // delete – принудительное зануление данных в объекте и декремент счетчика.
    // имена методов делай по ТЗ (тех задание). CRUD операции - это мировой стандарт, привыкай писать правильно.
    public void startCreate();
    public void startRead();
    public void startUpdate();
    public void startDelete();

}
