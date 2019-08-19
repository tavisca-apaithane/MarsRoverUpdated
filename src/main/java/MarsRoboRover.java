public class MarsRoboRover {
    private static int y = 0;
    private static int x = 0;
    private static String dir = "";
    public static Rover rover =null;

    public static void main(String[] args) {

        String currentPosition = "3 3 E";
        String commands = "MMRMMRMRRM";
        String[] positions = currentPosition.split(" ");
        x = Integer.valueOf(positions[0]);
        y = Integer.valueOf(positions[1]);
        dir = positions[2];
        String finalPosition = executeCommands(rover, x, y, dir, commands);
        System.out.println("currentPosition..." + currentPosition);
        System.out.println("commands..." + commands);
        System.out.println("newPosition..." + finalPosition);
    }

    public static String executeCommands(Rover rover, int x, int y, String dir, String commands)
    {
        rover = new Rover(x,y,dir);
        for (char command : commands.toCharArray()) {
            rover.rove(command);
        }
        return rover.getPosition();
    }
}
