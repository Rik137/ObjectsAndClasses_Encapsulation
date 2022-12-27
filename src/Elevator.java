public class Elevator {
    private int сurrentFloor = 1;
    private int minFloor;
    private int maxFloor;
    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getСurrentFloor() {
        return сurrentFloor;
    }
    public void setСurrentFloor(int сurrentFloor) {
        this.сurrentFloor = сurrentFloor;
    }
    public int moveDown() {
        int result = getСurrentFloor() - 1;
        setСurrentFloor(result);
        System.out.println(result + " -> этаж");
        return result;
    }
    public int moveUp() {
        int result = getСurrentFloor() + 1;
        setСurrentFloor(result);
        System.out.println(result + " -> этаж");
        return result;
    }
    public void move(int floor) {
        if (floor == getСurrentFloor()) {
            System.out.println("мы на этом этаже " + getСurrentFloor());
        } else if (floor > maxFloor || floor < minFloor) {
            System.out.println("этажа " + floor + " не существует");
        } else {
            if (floor > getСurrentFloor()) {
                for (int i = getСurrentFloor(); i < floor; i++) {
                    moveUp();
                }
            } else if (floor < getСurrentFloor()) {
                for (int i = getСurrentFloor(); i > floor; i--) {
                    moveDown();
                }
            }
        }
    }
}
