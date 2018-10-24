public class Sample1 {
    public static int retronaSis() {
        return 6;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static boolean isAdult(int todayYear, int todayMonth, int todayDay, int birthYear, int birthMonth, int birthDay) {

        if ((todayYear - birthYear) > 18) {
            return true;
        }else{
            if(((todayYear - birthYear) == 18) && (birthMonth<=todayMonth) && (birthDay<=todayDay)){
                return true;
            }else {
                return false;
            }
        }
    }

    public static int howManyDays(int month, int year){
        switch(month){
            case 1:
                return 31;
            case 2:
                if((year%4==0&&year%100!=0)||year%400==0){
                    return 29;
                }else{
                    return 28;
                }
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return 0;
        }
    }


}