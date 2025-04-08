module gal.iespazodamerce {
    requires javafx.controls;
    requires javafx.fxml;

    opens gal.iespazodamerce.controller to javafx.fxml;
    exports gal.iespazodamerce.controller;

    opens gal.iespazodamerce.model to javafx.fxml;
    exports gal.iespazodamerce.model;

    opens gal.iespazodamerce.view to javafx.fxml;
    exports gal.iespazodamerce.view;
}
