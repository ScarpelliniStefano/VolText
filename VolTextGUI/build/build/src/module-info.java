module VoltextGUI {
	
	requires javafx.base;
	requires javafx.graphics;
	requires javafx.controls;
	requires libraryVoltext;
	requires javafx.fxml;
	
	opens VolTEXTFX to javafx.graphics, javafx.fxml;
}
