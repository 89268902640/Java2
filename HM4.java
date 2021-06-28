package HM4.Java2;
import java.util.TreeMap;
public class HM4 {
    public static void main(String[] args) {

        String[] world = new String[10];
        world[0] = "Гора";
        world[1] = "Песня";
        world[2] = "Гусли";
        world[3] = "Пирог";
        world[4] = "Гора";
        world[5] = "Река";
        world[6] = "Небо";
        world[7] = "Озеро";
        world[8] = "Небо";
        world[9] = "0зеро";

        task1(world);

        task2();
    }

    public static void task1(String[] world){

       // 1	Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
       // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
       // Посчитать, сколько раз встречается каждое слово


        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i< world.length; i++){
            if (treeMap.containsKey(world[i])){
                treeMap.put(world[i], treeMap.get(world[i])+1);
            }else{
                treeMap.put(world[i], 1);
            }
        }

        System.out.println(treeMap);
    }

    public static void task2(){

       // 2	Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
       // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
       // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
       // тогда при запросе такой фамилии должны выводиться все телефоны


        PhoneList phoneList = new PhoneList();

        phoneList.add("Ирина", "79181992567");
        phoneList.add("Виктор", "79181991245");
        phoneList.add("Олег", "79181292345");
        phoneList.add("Михаил", "79181992345");
        phoneList.add("Владмир", "79181592314");
        phoneList.add("Олег", "79181992317");
        phoneList.add("Андрей", "79181163084");

        System.out.println(phoneList.get("Ирина"));
        System.out.println(phoneList.get("Виктор"));
        System.out.println(phoneList.get("Олег"));
        System.out.println(phoneList.get("Михаил"));
        System.out.println(phoneList.get("Владимир"));
        System.out.println(phoneList.get("Андрей"));
    }
}
