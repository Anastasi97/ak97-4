public class Main {
    public static void main(String[] args) {
        int money = 300;  //Начальная сумма на счете
        int refundMoney = 4562; //Сумма пополнения
        if (refundMoney > 1000) {
            int bonus = refundMoney / 100;
            System.out.println(money+refundMoney+bonus);
        }
        else {
            if (refundMoney<1000){
                System.out.println(money+refundMoney);
        }
        }
    }
}