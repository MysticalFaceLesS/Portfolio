class Lesson2Dz2 extends Thread {
	Lesson2Dz2(String nm) {
        setName(nm);
        start();
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println(getName() + " exiting.");
    }
    public static void main(String args[]) {
    	Lesson6Dz2 t1 = new Lesson6Dz2("One");
    	Lesson6Dz2 t2 = new Lesson6Dz2("Two");
    	Lesson6Dz2 t3 = new Lesson6Dz2("Three");

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Main Thread Exits now.");
    }
}