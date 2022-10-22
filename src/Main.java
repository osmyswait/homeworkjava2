public class Main {
    public static void main(String[] args) {

        int balance = 3746; // начальный баланс на счету
        int pay = 1000; // платеж
        int bonus = pay / 100; // бонус за пополнение счета
        int finalBalance = balance + pay + bonus; // итоговый баланс на счету

        if (pay >= 1000) {
            bonus = bonus;
        } else {
            bonus = 0;
        }


        System.out.println("Ваш счет пополнен на сумму " + pay);
        System.out.println("Из них бонусами начислено " + bonus);
        System.out.println("На счету " + finalBalance);
    }
}