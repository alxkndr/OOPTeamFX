module com.example.oopteamfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopteamfx to javafx.fxml;
    exports com.example.oopteamfx;
}