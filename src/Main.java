public class Main {
    public static void main(String[] args) {

        int balance = 100; // начальный баланс на счету
        int pay = 1000; // платеж

        int bonus = pay > 1000 ? pay / 100 : 0; // бонус за пополнение счета

        int finalBalance = balance + pay + bonus; // итоговый баланс на счету

        System.out.println("Ваш счет пополнен на сумму " + pay);
        System.out.println("Из них бонусами начислено " + bonus);
        System.out.println("На счету " + finalBalance);
    }
}