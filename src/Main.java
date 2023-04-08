public class Main {
    public static void main(String[] args) {
        int Money = 300;  //Начальная сумма на счете
        int RefundMoney = 4562; //Сумма пополнения
        if (RefundMoney > 1000) {
            int bonus = RefundMoney / 100;
            System.out.println(Money+RefundMoney+bonus);
        }
        else {
            if (RefundMoney<1000){
                System.out.println(Money+RefundMoney);
        }
        }
    }
}