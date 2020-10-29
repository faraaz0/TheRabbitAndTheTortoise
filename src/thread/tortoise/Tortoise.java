package thread.tortoise;

public class Tortoise extends Thread {
    private static final int MILESTONES = 5;

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                    System.out.println("The Tortoise is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(9000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Tortoise's sleep got interrupted!");
                    }
                    break;
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The Tortoise has lost the path!");
            }
        }
    }
}

