package com.puzikov.lab1;


 abstract public class Electronics implements ICrudAction{

    //todo целесообразность клсса Electronics ? в твоей реализации он ничего не делает. (Сделано)
    // С таким же успехом можно было просто сделать реализацию интерфейса ICrudAction в телефоне, смотрфоне и тд...
    // + класс Electronics должен быть абстрактным, а у тебя это просто класс.
    // необходимо вынести общие поля в абстрактный класс. Такие как имя, цена, кол-во товара, id и тд. (смысл тогда делать наследование, если ты ничего не наследуешь?...)


    //todo не смущает что среда разработки тебе точки с запятой окрашивает в серый?
    // они тут везде лизшние. Разберись где они ставятся,а где нет. Спойлер - после фигурных скобок не ставятся.

    public void startCreate(){
    };                                                              // заполнение объекта случайными значениями и инкремент счётчика
    public void startRead(){

    };                                                               // вывод данных на экран
    public void startUpdate(){

    };                                                                // ввод данных с клавиатуры
    public void startDelete(){

    };                                                                // принудительное зануление данных в объекте и декремент счетчика

};
//    String id;
//    String name;
//    String price;
//    String counter;
//    String firma;
//    String type;
//    String os;

