package app;

class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.9";
        System.out.println(appName);
        var libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
