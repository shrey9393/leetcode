class ParkingSystem {
    private int[] sp;

    public ParkingSystem(int big, int medium, int small) {
        sp = new int[] { big, medium, small };
    }

    public boolean addCar(int carType) {
        if (sp[carType - 1] > 0) {
            sp[carType - 1]--;
            return true;
        } else {
            return false;
        }
    }
}