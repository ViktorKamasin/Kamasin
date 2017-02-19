import java.util.Scanner;
//Даты
public class Task1 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Введите день");
        int day = num1.nextInt();
        System.out.println("Введите месяц");
        int month = num1.nextInt();
        System.out.println("Введите год");
        int year = num1.nextInt();
        if (day >=32 || month >=13 || year <1 || day<1 || month<1||(day>=29&&month==2&&year%4!=0)||(day>=29&&month==2)||
                (day==31&&(month==4||month==6||month==9||month==11))){
        System.out.println("Проверьте правильность написания даты");
        }
        else if ((day == 31) && (month ==1 || month==3 || month==5 || month==7 || month==8 || month==10)){
            month++;
            day-=30;
            format(day,month,year);
        } else if ((day ==30)&&(month==4||month ==6 || month==9 || month==11)){
            month++;
            day-=29;
            format(day,month,year);
        }else if ((day==28)&&(month==2)&&(year%4!=0)){
            month++;
            day-=27;
            format(day,month,year);
        }else if (day==31 && month==12) {
            year++;
            month -= 11;
            day -= 30;
            format(day, month, year);
        } else if((day==29)&&(month==2)&&(year%4==0)){
            day-=28;
            month++;
            format(day,month,year);
        }else{
            day++;
            format(day,month,year);
        }
        }
        public static void format(int day,int month,int year){
        String format = day+"."+month+"."+year;
            System.out.println("Дата следующего дня - "+format);
        }
        }

