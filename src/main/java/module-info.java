module gal.iespazodamerce {
    requires javafx.controls;
    requires javafx.fxml;

    opens gal.iespazodamerce to javafx.fxml;
    exports gal.iespazodamerce;
}
