


import java.util.*;

class Ноутбук {
    private String модель;
    private int озу;
    private int объемЖД;
    private String ос;
    private String цвет;

    public Ноутбук(String модель, int озу, int объемЖД, String ос, String цвет) {
        this.модель = модель;
        this.озу = озу;
        this.объемЖД = объемЖД;
        this.ос = ос;
        this.цвет = цвет;
    }

    public String getМодель() {
        return модель;
    }

    public int getОзу() {
        return озу;
    }

    public int getОбъемЖД() {
        return объемЖД;
    }

    public String getОс() {
        return ос;
    }

    public String getЦвет() {
        return цвет;
    }
}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<Ноутбук> ноутбуки = new HashSet<>();
        ноутбуки.add(new Ноутбук("Модель1", 8, 512, "Windows", "Черный"));
        ноутбуки.add(new Ноутбук("Модель2", 16, 1024, "MacOS", "Серый"));
        // Добавьте еще ноутбуков по аналогии

        // Запрашиваем критерии фильтрации у пользователя
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> фильтр = new HashMap<>();

        System.out.println("Введите цифру, соответствующую критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int выбор = scanner.nextInt();

        switch (выбор) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                int минОЗУ = scanner.nextInt();
                фильтр.put("ОЗУ", минОЗУ);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int минОбъемЖД = scanner.nextInt();
                фильтр.put("ОбъемЖД", минОбъемЖД);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String ос = scanner.next();
                фильтр.put("ОС", ос);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String цвет = scanner.next();
                фильтр.put("Цвет", цвет);
                break;
            default:
                System.out.println("Некорректный выбор.");
                return;
        }

        // Фильтрация и вывод результатов
        Set<Ноутбук> результаты = фильтровать(ноутбуки, фильтр);
        выводитьРезультаты(результаты);
    }

    private static Set<Ноутбук> фильтровать(Set<Ноутбук> ноутбуки, Map<String, Object> фильтр) {
        Set<Ноутбук> результаты = new HashSet<>(ноутбуки);

        for (Map.Entry<String, Object> entry : фильтр.entrySet()) {
            String критерий = entry.getKey();
            Object значение = entry.getValue();

            switch (критерий) {
                case "ОЗУ":
                    результаты.removeIf(ноутбук -> ноутбук.getОзу() < (int) значение);
                    break;
                case "ОбъемЖД":
                    результаты.removeIf(ноутбук -> ноутбук.getОбъемЖД() < (int) значение);
                    break;
                case "ОС":
                    результаты.removeIf(ноутбук -> !ноутбук.getОс().equalsIgnoreCase((String) значение));
                    break;
                case "Цвет":
                    результаты.removeIf(ноутбук -> !ноутбук.getЦвет().equalsIgnoreCase((String) значение));
                    break;
                default:
                    System.out.println("Неизвестный критерий: " + критерий);
            }
        }

        return результаты;
    }

    private static void выводитьРезультаты(Set<Ноутбук> результаты) {
        if (результаты.isEmpty()) {
            System.out.println("Ноутбуки не найдены по заданным критериям.");
        } else {
            System.out.println("Результаты поиска:");
            for (Ноутбук ноутбук : результаты) {
                System.out.println("Модель: " + ноутбук.getМодель() +
                        ", ОЗУ: " + ноутбук.getОзу() +
                        ", Объем ЖД: " + ноутбук.getОбъемЖД() +
                        ", ОС: " + ноутбук.getОс() +
                        ", Цвет: " + ноутбук.getЦвет());
            }
        }
    }
}


1