public class CarService {

    static int costOfOneHour = 50;

    //Метод getTimeEngineCheck возвращает время затраченное на проверкуавто в минутах
    static int getTimeEngineCheck(Master m, Vehicle v) {
        return m.experience * v.enginePower;
    }

    //Метод getCostOfWork возвращает стоимость выполненых работ
    static int getCostOfWork(int cost, int time) {
        return (time / 60) * cost;
    }

    // Метод EngineOilChange меняет масло для авто с ДВС и привязывает к авто последнего мастера
    static boolean EngineOilChange(Master m, Vehicle v) {
        if (v.isElectric) {
            return false;
        } else
            v.lastAutoMaintenanceMilePassed = 0;
        v.lastCheckedMaster = m;
        return true;
    }

    public static void main(String[] args) {

        Master ivan = new Master(20, "Ivan", 2);
        Master dmitro = new Master(45, "Dmitro", 15);

        Vehicle minivan = new Vehicle(250000, 2010, "Volkswagen", false, 100, 7000, ivan);
        Vehicle talisman = new Vehicle(195000, 2015, "Renault", false, 80, 5000, dmitro);

        System.out.println("Время замены масла для " + minivan.Model + "\t" + getTimeEngineCheck(ivan, minivan) + " minutes");
        System.out.println("Стоимость замены масла для " + minivan.Model + "\t" + getCostOfWork(costOfOneHour, getTimeEngineCheck(ivan, minivan)) + "$");
        System.out.println("Масло заменено в " + talisman.Model + " Мастером " + dmitro.name + EngineOilChange(dmitro, talisman));
    }
}