public class HiLo {
    public static void main(String[] args) {
        //Генерация случайного числа, которое будет отгадывать пользователь
        int theNumber = (int) (Math.random()*100+1);
        System.out.println(theNumber);
    }
}
