public class Main {
    public static void main(String[] args) {
        int c=4;
        if (c>3 && c>2 && c >1 || c!=89)
            System.out.println("more");
        else
            System.out.println("less");
        for (int i = 0; i < 5; i++) {
            System.out.println("da");
        }
        int b=3;
        System.out.println(b+1);
        System.out.println(b+2);
        int a=3;
        System.out.println(++a);
        System.out.println(a);
        System.out.println("example for git");
        System.out.println("example for git two");
//коварство инкремента первое выражение с b подтверждает что в примитиве все передается по значению, не вмешиваясь в изначальную
//переменную
//а второе выражение с а показывает, что инкремент преобразует саму переменную(как будто это ссылочный тип)


    }
}
