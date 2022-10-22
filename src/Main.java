public class Main {
    public static void main(String[] args) {

        int balance = 3746; // начальный баланс на счету
        int pay = 1847; // платеж
        int bonus = pay / 100; // бонус за пополнение счета
        int finalBalance; // итоговый баланс на счету

        if (pay >= 1000) {
            finalBalance = balance + pay + bonus;
        } else {
            finalBalance = balance + pay;
        }


        System.out.println("Ваш счет пополнен на сумму " + pay);
        System.out.println("Из них бонусами начислено " + bonus);
        System.out.println("На счету " + finalBalance);
    }
}