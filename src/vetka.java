import java.util.Scanner;

class main {

        public static void main(String[] args) {
            String[] canal = new String[]{"Выход", "Первый калал.", "Второй канал.", "Третий канал.", "Четвертый канал."};
            System.out.print("Поддерживаемые каналы 1, 2, 3, 4. Введите номер канала: ");
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            while (true) {
                if (x == 1) {
                    System.out.print(canal[1]);
                    System.out.print(" Можете попробовать ввести еще один канал: ");
                    x = scan.nextInt();
                } else if (x == 2) {
                    System.out.print(canal[2]);
                    System.out.print(" Можете попробовать ввести еще один канал: ");
                    x = scan.nextInt();
                } else if (x == 3) {
                    System.out.print(canal[3]);
                    System.out.print(" Можете попробовать ввести еще один канал: ");
                    x = scan.nextInt();
                } else if (x == 4) {
                    System.out.print(canal[4]);
                    System.out.print(" Можете попробовать ввести еще один канал: ");
                    x = scan.nextInt();
                } else if (x == 0) {
                    System.out.print(canal[0]);
                    break;
                } else {
                    System.out.print("Введен неподдерживаемый канал, введите канал еще раз: ");
                    x = scan.nextInt();
                }
            }
            //Внесли изменения и пробуем ветку смержить с main)
        }

}
