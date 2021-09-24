package app;

class LibraryApp {

    // App Name

    private static final String APP_NAME = "Biblioteka v1.3";

    public static void main(String[] args) {

        System.out.println(APP_NAME);

        var libControl = new LibraryControl();
        libControl.controlLoop();
    }

}
